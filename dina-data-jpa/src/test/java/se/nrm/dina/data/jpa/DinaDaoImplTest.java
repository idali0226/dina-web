/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith; 
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;
import static org.testng.Assert.assertEquals;  
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.EntityBean;

/**
 *
 * @author idali
 */
@RunWith(MockitoJUnitRunner.class)
public class DinaDaoImplTest {

    @Mock
    EntityManager entityManager;

    @Mock
    Query query;

    @Mock
    TypedQuery<String> tq;

    @Mock
    TypedQuery<Object[]> tqObj;

    @Mock
    TypedQuery<Integer> intTQ;

    private DinaDao dao;
    private List<Accession> accessions;
    private List<Accession> accessions1;
    private Accession accession1;

    public DinaDaoImplTest() {

    }

    @Before
    public void setUp() {
        dao = new DinaDaoImpl(entityManager);
        preparaTestData();
    }

    @After
    public void tearDown() {
        dao = null;
        accession1 = null;
        accessions = null;
        accessions1 = null; 
    }

    /**
     * Test of findAll method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");

        when(entityManager.createNamedQuery(Accession.class.getSimpleName() + ".findAll")).thenReturn(query);
        when(query.getResultList()).thenReturn(accessions);
        int expResult = 10;

        List result = dao.findAll(Accession.class);
        verify(entityManager).createNamedQuery(Accession.class.getSimpleName() + ".findAll");
        verify(query).getResultList();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of findAll with conditions method, of class DinaDaoImpl.
     * @throws java.lang.Exception
     */
     @Test
    public void testFindAllWithConditions() throws Exception {

        System.out.println("testFindAllWithConditions");
        
        Class clazz = Accession.class;

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT a From Accession a "); 
        sb.append("WHERE a.accessionID"); 
        sb.append(" BETWEEN ");
        sb.append(3);
        sb.append(" AND ");
        sb.append(8);
 
        int limit = 3;
        Map<String, String> conditions = null;
         
        int expResultSize = 3;
        
        when(entityManager.createQuery(sb.toString())).thenReturn(query); 
        when(query.setMaxResults(limit)).thenReturn(query);
        when(query.getResultList()).thenReturn(accessions1);
        
        List result = dao.findAll(clazz, sb.toString(), limit, conditions);
        
        verify(entityManager).createQuery(sb.toString());
        verify(query).setMaxResults(limit);
        verify(query).getResultList();
        assertEquals(expResultSize, result.size()); 
    }

    /**
     * Test of findById method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");

        when(entityManager.find(Accession.class, 20, LockModeType.OPTIMISTIC)).thenReturn(accession1);

        EntityBean result = dao.findById(20, Accession.class);
        verify(entityManager).find(Accession.class, 20, LockModeType.OPTIMISTIC);
        assertSame(accession1, result);
    }

    /**
     * Test of findByReference method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFindByReference() throws Exception {
        System.out.println("findByReference");

        Accession expResult = accession1;

        when(entityManager.getReference(Accession.class, 20)).thenReturn(accession1);

        EntityBean acc = dao.findByReference(20, Accession.class);
        verify(entityManager).getReference(Accession.class, 20);
        assertEquals(expResult, acc);
    }

    /**
     * Test of create method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");

        EntityBean bean = new Accession(50);
 
        int expResult = 50;
        Accession result = (Accession) dao.create(bean);
        verify(entityManager).persist(bean);
        verify(entityManager).flush(); 
        assertEquals(expResult, (int) result.getAccessionID());
    }

    /**
     * Test of merge method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMerge() throws Exception {
        System.out.println("merge");

        accession1.setAccessionNumber("acc00060");
        String expResult = "acc00060";

        when(entityManager.merge(accession1)).thenReturn(accession1);
        Accession result = (Accession) dao.merge(accession1);
        
        verify(entityManager).merge(accession1);
        assertEquals(expResult, result.getAccessionNumber());
    }

    /**
     * Test of updateByJPQL method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testUpdateByJPQL() throws Exception {
        System.out.println("updateByJPQL");

        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE Accession a SET a.assectionNumber = 'acc1235'");
        sb.append(" WHERE a.accessionId = 20");

        when(entityManager.createQuery(sb.toString())).thenReturn(query);
        when(query.executeUpdate()).thenReturn(1);

        boolean result = dao.updateByJPQL(sb.toString());
        verify(entityManager).createQuery(sb.toString());
        verify(query).executeUpdate();
        assertTrue(result);
    }
 
    /**
     * Test of delete method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");

        dao.delete(accession1);

        verify(entityManager).remove(accession1);
        verify(entityManager).flush();
    }
    
 
 
    /**
     * Test of getEntityByJPQL method, of class DinaDaoImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetEntityByJPQL() throws Exception {
        System.out.println("getEntityByJPQL");
        String jpql = "SELECT a FROM Accession WHERE a.accessionId = 2";

        when(entityManager.createQuery(jpql)).thenReturn(query);
        when(query.getSingleResult()).thenReturn(accession1);

        Object expResult = accession1;
        EntityBean result = dao.getEntityByJPQL(jpql);
        verify(entityManager).createQuery(jpql);
        verify(query).getSingleResult();
        assertEquals(expResult, result);
    }

    private void preparaTestData() {
        accessions = new ArrayList();
        Accession accession = new Accession(1);
        accessions.add(accession);
        accession = new Accession(2);
        accessions.add(accession);
        accession = new Accession(3);
        accessions.add(accession);
        accession = new Accession(4);
        accessions.add(accession);
        accession = new Accession(5);
        accessions.add(accession);
        accession = new Accession(6);
        accessions.add(accession);
        accession = new Accession(7);
        accessions.add(accession);
        accession = new Accession(8);
        accessions.add(accession);
        accession = new Accession(9);
        accessions.add(accession);
        accession = new Accession(10);
        accessions.add(accession);
        
        accessions1 = new ArrayList();
        accessions1.add(new Accession(3));
        accessions1.add(new Accession(4));
        accessions1.add(new Accession(5));

        accession1 = new Accession(20);
        accession1.setAccessionNumber("acc00020");
    }

}
