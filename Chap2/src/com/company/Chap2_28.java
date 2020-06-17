package com.company;

import java.util.Scanner;

public class Chap2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.println("Enter radius of the Circle: ");
        radius = input.nextInt();

        System.out.println("Diameter = "+2*radius);
        System.out.println("Circumference = "+2*Math.PI*radius);
        System.out.println("Area= "+Math.PI*Math.pow(radius,2));

    }
}
