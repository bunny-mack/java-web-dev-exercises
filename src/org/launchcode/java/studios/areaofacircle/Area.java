package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        if (radius > 0) {
            System.out.println("The area of a circle with radius " + radius + " is " + area);
        } else {
            System.err.println("Please enter a valid number");
        }
    }
}
