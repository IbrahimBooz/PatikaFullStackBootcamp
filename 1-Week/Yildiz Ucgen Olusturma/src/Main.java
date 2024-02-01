import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inpt=new Scanner(System.in);
        System.out.print("Bir Sayı giriniz:");
        k=inpt.nextInt();
        for (int i = 1; i <= k; i++) {

            for(int n=1; n<=(k-i); n++){

                System.out.print(" ");
            } for(int j=1; j<=(2*i)-1; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}