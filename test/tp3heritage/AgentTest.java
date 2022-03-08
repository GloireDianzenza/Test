/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3heritage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class AgentTest {
    
    public AgentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afficherInfo method, of class Agent.
     */
    @Test
    public void testAfficherInfo() {
        System.out.println("afficherInfo");
        Agent instance = null;
        String expResult = "";
        String result = instance.afficherInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculerImpot method, of class Agent.
     */
    @Test
    public void testCalculerImpot() {
        System.out.println("calculerImpot");
        Agent instance = null;
        double expResult = 0.0;
        double result = instance.calculerImpot();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getNumAgent method, of class Agent.
     */
    @Test
    public void testGetNumAgent() {
        System.out.println("getNumAgent");
        Agent instance = null;
        int expResult = 0;
        int result = instance.getNumAgent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumAgent method, of class Agent.
     */
    @Test
    public void testSetNumAgent() {
        System.out.println("setNumAgent");
        int numAgent = 0;
        Agent instance = null;
        instance.setNumAgent(numAgent);
    }

    /**
     * Test of getNomAgent method, of class Agent.
     */
    @Test
    public void testGetNomAgent() {
        System.out.println("getNomAgent");
        Agent instance = null;
        String expResult = "";
        String result = instance.getNomAgent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNomAgent method, of class Agent.
     */
    @Test
    public void testSetNomAgent() {
        System.out.println("setNomAgent");
        String nomAgent = "";
        Agent instance = null;
        instance.setNomAgent(nomAgent);
    }

    /**
     * Test of isMarie method, of class Agent.
     */
    @Test
    public void testIsMarie() {
        System.out.println("isMarie");
        Agent instance = null;
        boolean expResult = false;
        boolean result = instance.isMarie();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMarie method, of class Agent.
     */
    @Test
    public void testSetMarie() {
        System.out.println("setMarie");
        boolean marie = false;
        Agent instance = null;
        instance.setMarie(marie);
    }

    /**
     * Test of getSalaire method, of class Agent.
     */
    @Test
    public void testGetSalaire() {
        System.out.println("getSalaire");
        Agent instance = null;
        int expResult = 0;
        int result = instance.getSalaire();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSalaire method, of class Agent.
     */
    @Test
    public void testSetSalaire() {
        System.out.println("setSalaire");
        int salaire = 4000;
        Agent instance = new Agent(1, "Brian", true, 3800);
        instance.setSalaire(salaire);
        assertEquals(instance.getSalaire(), salaire);
    }

    /**
     * Test of compareTo method, of class Agent.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Agent o = null;
        Agent instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
}
