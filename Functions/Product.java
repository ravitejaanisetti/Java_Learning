package Functions;

import java.util.Scanner;

public class Product {
    public static int getProduct(int a, int b){
        int product = a*b;
        System.out.println("Product of "+a+" & "+b+" is "+product);

        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        getProduct(a,b);
    }
}
