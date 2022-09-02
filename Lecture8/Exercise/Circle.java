package Lecture8.Exercise;

import java.util.Scanner;

public class Circle {
    public static void getCircumference(int r){
        double circumference =2*3.14*r;

        System.out.println(circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius of the circle:");
        int r = sc.nextInt();

        getCircumference(r);
    }
}
