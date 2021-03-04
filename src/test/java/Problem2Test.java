/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author antho
 */
public class Problem2Test {
    
    @Test
    public void testCalculateBankCharges1() {
        System.out.println("calculateBankCharges");
        double numChecks = 10.0;
        double expResult = 11.0;
        double result = Problem2.calculateBankCharges(numChecks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateBankCharges2() {
        System.out.println("calculateBankCharges");
        double numChecks = 30.0;
        double expResult = 12.4;
        double result = Problem2.calculateBankCharges(numChecks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateBankCharges3() {
        System.out.println("calculateBankCharges");
        double numChecks = 50.0;
        double expResult = 13.0;
        double result = Problem2.calculateBankCharges(numChecks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateBankCharges4() {
        System.out.println("calculateBankCharges");
        double numChecks = 70.0;
        double expResult = 12.8;
        double result = Problem2.calculateBankCharges(numChecks);
        assertEquals(expResult, result, 0.0);
    }
    
}
