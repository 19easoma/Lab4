/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
import java.util.Scanner;

class Problem2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the number of checks for the month: ");
    int numChecks = keyboard.nextInt();

    calculateBankCharges(numChecks);
  }
  
  public static double calculateBankCharges(double numChecks) {
    
    double baseFee = 10;
    double finalCharge = 0;
    double checkFee = 0;
    
    if (numChecks < 20) {
      checkFee = 0.10;
    } else if (numChecks >= 20 && numChecks < 40) {
      checkFee = 0.08;
    } else if (numChecks >= 40 && numChecks < 60) {
      checkFee = 0.06;
    } else {
      checkFee = 0.04;
    }
    
    finalCharge = baseFee + (checkFee * numChecks);
    
    System.out.println("Service fees: $" + finalCharge);
    
    return finalCharge;
    }
}

