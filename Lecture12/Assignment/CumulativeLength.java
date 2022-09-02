package Lecture12.Assignment;

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to store the strings");
        int size = sc.nextInt();
        System.out.println("Enter the strings you want:");
        String array[]=new String[size];
        int totalLength = 0;

        for(int i=0; i< size; i++){
            array[i]=sc.nextLine();
            totalLength=totalLength+array[i].length();
        }
        System.out.println("Total length of the given strings is "+totalLength);
    }
}
