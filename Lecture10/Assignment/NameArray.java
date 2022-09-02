package Lecture10.Assignment;

import java.util.Scanner;

public class NameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int arraySize = sc.nextInt();

        String names[] = new String[arraySize];

        for(int i=0; i<arraySize; i++){
            System.out.println("Enter you name: ");
            names[i]=sc.next();
        }

        for(int i=0; i< names.length; i++){
            System.out.println("Names "+(i+1)+ " is: "+names[i]);
        }
    }
}
