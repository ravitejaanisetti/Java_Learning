package Functions.Practice;

import java.util.Scanner;

public class Average {
    public static int getAverage(int val1, int val2, int val3){

        int average = (val1+val2+val3)/3;

        return average;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1");
        int val1=sc.nextInt();
        System.out.println("Enter value 2");
        int val2=sc.nextInt();
        System.out.println("Enter value 3");
        int val3=sc.nextInt();
        System.out.println("Average of "+val1+","+val2+","+val3+" is "+getAverage(val1,val2,val3));

    }
}
