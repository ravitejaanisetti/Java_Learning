package Lecture3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button number");
        int button = sc.nextInt();
        //String String = sc.next();

        switch (button){
            case 1 :
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("invalid button");
        }

    }
}
