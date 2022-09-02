package Lecture2.Assignments;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("You are "+age+" years old");
    }

    public static class Circle {
        public static void main(String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius of the circle");
            int r = sc.nextInt();
            int Diameter = r * 2;
            double Area = 3.14159 *(r*r);
            double Perimeter = 2 * 3.14159 * r;
            System.out.println("Diameter of the circle "+Diameter);
            System.out.println("Area of the circle "+Area);
            System.out.println("Perimeter of the circle "+Perimeter);

        }
    }
}
