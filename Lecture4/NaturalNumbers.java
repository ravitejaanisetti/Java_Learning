package Lecture4;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value:");
        int n = sc.nextInt();
        int sum =0;

        for(int i=0; i<=4; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
