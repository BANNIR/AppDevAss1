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
public class DiscountRateIT {

    public DiscountRateIT() {
    }

    /**
     * Test of getProductDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetProductDiscountRate() {
        System.out.println("getProductDiscountRate");
        String type = "Premium";
        DiscountRate instance = new DiscountRate();
        double expResult = 0.1;
        double result = instance.getProductDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getServiceDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetServiceDiscountRate() {
        System.out.println("getServiceDiscountRate");
        String type = "Premium";
        DiscountRate instance = new DiscountRate();
        double expResult = 0.2;
        double result = instance.getServiceDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
