package Lecture4;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int n = sc.nextInt();

        for (int i=1; i<=20; i++){
            System.out.println(n+" x "+i+" = "+(i*n));
        }

    }
}
