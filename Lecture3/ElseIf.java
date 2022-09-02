package Lecture3;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1");
        int a = sc.nextInt();
        System.out.println("Enter the value2");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is lesser than " + b);
        }
    }
}


