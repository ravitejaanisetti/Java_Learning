package Functions.Practice;

import java.util.Scanner;

public class Even  {
    public static boolean isEven(int n ){
        boolean isEven=true;
        if(n%2==0){
            isEven=false;
        }
        return isEven;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
