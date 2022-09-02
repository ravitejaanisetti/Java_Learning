package Lecture3.Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        double div = a/b;
        int rem = a%b;

        switch (button){
            case 1 :
                System.out.println(add);
                break;
            case 2 :
                System.out.println(sub);
                break;
            case 3 :
                System.out.println(multi);
                break;
            case 4 :
                System.out.println(div);
                break;
            case 5 :
                System.out.println(rem);
                break;
            default:
                System.out.println("Operator not supported");
        }
    }
}
