package Lecture3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are not an Adult ");
        }
    }
}

