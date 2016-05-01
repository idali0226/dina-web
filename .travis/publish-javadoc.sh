#!/bin/bash
#
# Publish Javadoc of successful CI builds to http://cbeams.github.io/libjava/api
#
# See http://benlimmer.com/2013/12/26/automatically-publish-javadoc-to-gh-pages-with-travis-ci

if [ "$TRAVIS_REPO_SLUG" == "idali0226/dina-web" ] \
        && [ "$TRAVIS_JDK_VERSION" == "oraclejdk8" ] \
        && [ "$TRAVIS_PULL_REQUEST" == "false" ] \
        && [ "$TRAVIS_BRANCH" == "master" ]; then

    echo "Publishing javadoc..."

    git config --global user.email "travis@travis-ci.org"
    git config --global user.name "travis-ci"

    # Create a fresh clone in which to run delombok and commit the results to the delombok branch
    cd $HOME
    git clone --quiet --branch=mybranch https://${GH_TOKEN}@github.com/idali0226/dina-web mybranch > /dev/null

    cd mybranch
    git reset --hard origin/master
    ./gradlew mybranch
    git rm .travis.yml # to avoid triggering a build when this branch is pushed
    git commit -am "mybranch Java sources"
    git push -fq origin mybranch > /dev/null

    # Run javadoc over delomboked sources to pick up all methods and constructors
    ./gradlew javadoc
    cp -R build/docs/javadoc $HOME/api-temp

    # Create a fresh clone in which to publish Javadoc to gh-pages
    cd $HOME
    git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/idali0226/dina-web gh-pages > /dev/null
    cd gh-pages
    git rm -rf ./api
    cp -Rf $HOME/api-temp ./api
    git add -f .
    git commit -m "Publish Javadoc from Travis CI build $TRAVIS_BUILD_NUMBER"
    git push -fq origin gh-pages > /dev/null

    echo "Published Javadoc to gh-pages. See http://idali0226.github.io/dina-web/api"
fi
