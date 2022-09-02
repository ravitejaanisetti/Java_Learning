package Lecture2;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1:");
        int a = sc.nextInt();
        System.out.println("Enter the value2:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum Of Value1 & Value2 is "+sum);
    }
}
