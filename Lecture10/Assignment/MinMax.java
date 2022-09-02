package Lecture10.Assignment;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = sc.nextInt();

        int numbers[]=new int[arraySize];

        for(int i=0; i<arraySize; i++){
            System.out.println("Enter the numbers");
            numbers[i]=sc.nextInt();
        }

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Largest number is "+max);
        System.out.println("Smallest numbber is "+min);

    }
}
