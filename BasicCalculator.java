 
package com.mycompany.basiccalculator;

import java.util.Scanner;
 
public class BasicCalculator {

    public static void main(String[] args) {
        
         MountainBike b = new MountainBike(5,5,5,6);
       //  b.applyBrake(0);
        int num1, num2;

        Scanner sc = new Scanner(System.in);     

        System.out.println("Enter the numbers: ");
        
        num1 = sc.nextInt();
        num2 = sc.nextInt();
       
        System.out.println(num1+ " + " +num2+ " = " + Math.addExact(num1,num2));
        System.out.println(num1+ " - " +num2+ " = " + Math.subtractExact(num1, num2));
        System.out.println(num1+ " * " +num2+ " = " + Math.multiplyExact(num1, num2));
        System.out.println(num1+ " / " +num2+ " = " + Math.divideExact(num1, num2));
        System.out.println(num1+ " ^ " +num2+ " = " + Math.pow(num1, num2));
        System.out.println(" √ " +num1+ " = " + Math.sqrt(num1));

    }
}
