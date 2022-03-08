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
public class AgentAvecEnfantTest {
    
    public AgentAvecEnfantTest() {
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
     * Test of afficherInfo method, of class AgentAvecEnfant.
     */
    @Test
    public void testAfficherInfo() {
        System.out.println("afficherInfo");
        AgentAvecEnfant instance = null;
        String expResult = "";
        String result = instance.afficherInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerImpot method, of class AgentAvecEnfant.
     */
    @Test
    public void testCalculerImpot() {
        System.out.println("calculerImpot");
        AgentAvecEnfant instance = null;
        double expResult = 0.0;
        double result = instance.calculerImpot();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
