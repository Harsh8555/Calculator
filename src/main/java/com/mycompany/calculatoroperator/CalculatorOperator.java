/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatoroperator;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CalculatorOperator {
    public static void calculatorMenu(int opts[],String items[]){ 
    
    System.out.println("\n C A L C U L A T O R");
     System.out.println("=================================");
     for (int i =0;i < opts.length-1;i++)
     {
     System.out.printf("%d. %s\t\n",opts[i],items[i]);
     }
      System.out.printf("%d. %s\t\n",opts[opts.length-1],items[items.length-1]);
     System.out.println("=================================");
     System.out.println("ENTER 1,2,3, or 4 to select an operator\n");
     
}
    
    

    public static void main(String[] args) {
       
       int choice;
       int option[] = {1,2,3,4,5};
       String operatorMenu[] = {"Addition","Subtraction", "Multiplication","Division","Exit"};
       double firstnum, secondnum,answer;
       
       int Exit = option[option.length-1];
       calculatorMenu(option,operatorMenu);
       
       Scanner in = new Scanner(System.in);
       
       choice = in.nextInt();
       
       while(choice !=Exit)
       {
           if(choice==option[0])
           {
               
               System.out.println("Enter First Number");
               firstnum = in.nextDouble();
               System.out.println("Enter Second Number");
               secondnum = in.nextDouble();
               answer= firstnum + secondnum;
               System.out.println("Firstnumber + Secondnumber : = " + answer);
           }
           else if (choice == option[1])
           {
               
               System.out.println("Enter First Number");
               firstnum = in.nextDouble();
               System.out.println("Enter Second Number");
               secondnum = in.nextDouble();
               answer= firstnum - secondnum;
               System.out.println("Firstnumber - Secondnumber : = " + answer);
           }
           
       {
           if(choice==option[2])
           {
               
               System.out.println("Enter First Number");
               firstnum = in.nextDouble();
               System.out.println("Enter Second Number");
               secondnum = in.nextDouble();
               answer= firstnum * secondnum;
               System.out.println("Firstnumber * Secondnumber : = " + answer);
           }
           
       {
           if(choice==option[3])
           {
               
               System.out.println("Enter First Number");
               firstnum = in.nextDouble();
               System.out.println("Enter Second Number");
               secondnum = in.nextDouble();
               answer= firstnum / secondnum;
               System.out.println("Firstnumber / Secondnumber : = " + answer);
           }
               
               
           }
       }
       
    }
       
    }
}
