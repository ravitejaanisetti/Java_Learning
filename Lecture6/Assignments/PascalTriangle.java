package Lecture6.Assignments;

public class PascalTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-i;j++){
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
