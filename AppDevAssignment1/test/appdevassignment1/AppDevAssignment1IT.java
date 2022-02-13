/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdevassignment1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shahe
 */
public class AppDevAssignment1IT {

    public AppDevAssignment1IT() {
    }

    /**
     * Test of lengthGood method, of class AppDevAssignment1.
     */
    @Test
    public void testLengthGood() {
        System.out.println("lengthGood");
        String pass = "abc}DEFGhij";
        boolean expResult = true;
        boolean result = AppDevAssignment1.lengthGood(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of upperGood method, of class AppDevAssignment1.
     */
    @Test
    public void testUpperGood() {
        System.out.println("upperGood");
        String pass = "abc}DEF";
        boolean expResult = true;
        boolean result = AppDevAssignment1.upperGood(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of lowerGood method, of class AppDevAssignment1.
     */
    @Test
    public void testLowerGood() {
        System.out.println("lowerGood");
        String pass = "abc}DEF";
        boolean expResult = true;
        boolean result = AppDevAssignment1.lowerGood(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of specialGood method, of class AppDevAssignment1.
     */
    @Test
    public void testSpecialGood() {
        System.out.println("specialGood");
        String pass = "abc}DEF";
        boolean expResult = true;
        boolean result = AppDevAssignment1.specialGood(pass);
        assertEquals(expResult, result);
    }

}
