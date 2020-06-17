package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chap2_17 {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();
        System.out.println("Enter third integer: ");
        number3 = input.nextInt();
        int sum = number1+number2+number3;
        int avg=sum/3;
        int product = number1*number2*number3;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
        System.out.println("Product is: " + product);

        int minNum = number1;
        if (number3 < number1){
            if(number3<number2){
         minNum = number3;}}
        if (number2 < minNum){
                minNum = number2;}
       System.out.println("Smallest number is: "+ minNum);


       int maxNum = number1;
       if (number3 > number1){
           if (number3 > number2){
               maxNum = number3;}}
       if (number2 > maxNum){
               maxNum = number2;}
       System.out.println("largest number is: "+ maxNum);





   }
}