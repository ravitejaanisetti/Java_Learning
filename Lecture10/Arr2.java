package Lecture10;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array: ");
        int size = sc.nextInt();
        int numbers []=new int[size];

        //input into array
        for(int i=0; i< numbers.length; i++){
            System.out.println("Enter your value at index "+i);
            numbers[i]=sc.nextInt();

        }
        //output of array
        for (int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
