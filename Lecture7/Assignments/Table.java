package Lecture7.Assignments;

import java.util.Scanner;

public class Table {
    public static void table(int n, int m) {

        for (int i = 1; i <= m; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        System.out.println("Enter the table limit:");
        int m = sc.nextInt();

        table(n,m);

    }
}

