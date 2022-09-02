package Lecture2.Assignments;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius of the circle:");
        int r = sc.nextInt();
        double diameter = r*2;
        double area = 3.14*(r*r);
        double perimeter = 2*3.14*r;

        System.out.println("Diameter of the Circle is "+diameter);
        System.out.println("Area of the Circle is "+area);
        System.out.println("Perimeter of the Circle is "+perimeter);
    }
}
