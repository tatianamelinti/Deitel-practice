package com.company;
import java.util.Scanner;
// write your code here
public class Chap2_15 {
   public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           double number1;
           double number2;
           System.out.println("Enter an integer: ");
            number1 = input.nextDouble();
           System.out.println("Enter the second integer: ");
            number2 = input.nextDouble();
           double sum= number1+number2;
           double product = number1 * number2;
           double difference = number1 -number2;
           double quotient = number1/number2;
           System.out.println("The sum is: " + sum);
           System.out.println("The product is: " + product);
           System.out.println("The difference is: " + difference);
           System.out.println("The quotient is: " + quotient);

       }

    }


