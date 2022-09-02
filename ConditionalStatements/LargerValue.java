package ConditionalStatements;

import java.util.Scanner;

public class LargerValue {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1");
        int val1 = sc.nextInt();
        System.out.println("Enter value2");
        int val2 = sc.nextInt();

        if(val1>val2){
            System.out.println(val1+" is largest of given 2 values");
        } else {
            System.out.println(val2+" is largest of given 2 values");
        }

    }
}
