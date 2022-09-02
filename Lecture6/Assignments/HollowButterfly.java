package Lecture6.Assignments;

public class HollowButterfly {
    public static void main(String[] args) {
        int n=5;

        //first half
        for(int i=1; i<=n; i++){
            //stars
            for(int j = 1; j<=i; j++){
                //int sum=i+j;
                if(j==1||j==i){
                    System.out.print("*");
                    //inner spaces
                } else {
                    System.out.print(" ");
                }
            }
            //outer spaces
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
                for(int j = 1; j<=i; j++){
                    //int sum=i+j;
                    if(j==1||j==i){
                        System.out.print("*");
                        //inner spaces
                    } else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        //second half
        for(int i=n; i>=1; i--){
            //stars
            for(int j = 1; j<=i; j++){
                //int sum=i+j;
                if(j==1||j==i){
                    System.out.print("*");
                    //inner spaces
                } else {
                    System.out.print(" ");
                }
            }
            //spaces
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                //int sum=i+j;
                if(j==1||j==i){
                    System.out.print("*");
                    //inner spaces
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
