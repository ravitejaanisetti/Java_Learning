package Lecture7;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Product {
    public static int calculateProduct(int a, int b){
        //int product = a*b;
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value1:");
        int a = sc.nextInt();
        System.out.print("Enter Value2:");
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("Product of "+a+" and "+b+" is "+product);
    }
}
