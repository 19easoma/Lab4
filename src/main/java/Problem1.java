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

class Problem1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    int userAge = keyboard.nextInt();
   
    calculateInsurance(userAge);
  }
  
  public static void calculateInsurance(int userAge) {
    int estInsurance = (5 * userAge) + 300;
    System.out.println("At " + userAge + " years old, the estimated payment for life insurance would be $" + estInsurance + " per year.");
  }
}

