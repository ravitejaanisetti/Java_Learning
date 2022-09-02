package Lecture4.Assignments;
//Print all even numbers till n.
import java.util.Scanner;

public class Even {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();
        int i = 0;
        for(i=0; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
