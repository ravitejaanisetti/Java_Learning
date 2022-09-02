package Lecture8.Exercise;

import java.util.Scanner;

public class Average {
    public static void averageNumber(int a, int b, int c){
        int sum = a+b+c;
        int average = sum/3;

        System.out.println("Average of values is "+average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1:");
        int a = sc.nextInt();
        System.out.println("Enter the value2:");
        int b = sc.nextInt();
        System.out.println("Enter the value3");
        int c = sc.nextInt();

        averageNumber(a,b,c);

    }
}
