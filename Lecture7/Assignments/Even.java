package Lecture7.Assignments;

import java.util.Scanner;

public class Even {
    public static void evenNumber(int n){
        if(n%2==0){
            System.out.println(n+" is a even number");
        } else{
            System.out.println(n+" is a odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();

        evenNumber(n);

    }
}
