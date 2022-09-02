package Functions;

import java.util.Scanner;

public class Func2 {
    public static int getSum(int a, int b){
        int sum=a+b;
        System.out.println("sum is: "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        getSum(a,b);

    }
}
