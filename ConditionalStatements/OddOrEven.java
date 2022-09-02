package ConditionalStatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Value");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("Given value is even number");
        } else {
            System.out.println("Given value is odd number");
        }
    }
}
