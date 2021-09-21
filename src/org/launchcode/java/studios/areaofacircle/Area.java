package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner mcScan = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = mcScan.nextInt();
        double area = Circle.getArea(radius);
        System.out.print("The area of your circle is " + area);
    }
}


