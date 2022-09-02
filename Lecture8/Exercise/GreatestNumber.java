package Lecture8.Exercise;

import java.util.Scanner;

public class GreatestNumber {
    public static void getGreater(int a, int b){
        if (a>b){
            System.out.println(a+ "is greater of among the given two numbers");
        } else{
            System.out.println(b+" is greater among the given two numbers");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value1: ");
        int a = sc.nextInt();
        System.out.print("Enter the value2: ");
        int b = sc.nextInt();

        getGreater(a, b);

    }
}
