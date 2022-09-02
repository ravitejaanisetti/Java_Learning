package Lecture8.Exercise;

import java.util.Scanner;

public class Age {
    public static void age(int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        age(age);
    }
}
