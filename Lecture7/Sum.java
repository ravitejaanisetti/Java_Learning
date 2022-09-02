package Lecture7;

import java.util.Scanner;


public class Sum {
    public static int calculateSum(int a, int b){
        int sum =  a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value1: ");
        int a = sc.nextInt();
        System.out.print("Enter Value2: ");
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
    }
}
