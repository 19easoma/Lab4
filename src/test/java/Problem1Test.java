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
public class Problem1Test {
    
    public Problem1Test() {
    }

    @Test
    public void testCalculateInsurance() {
        System.out.println("calculateInsurance");
        int userAge = 33;
        Problem1.calculateInsurance(userAge);
    }
    
}
