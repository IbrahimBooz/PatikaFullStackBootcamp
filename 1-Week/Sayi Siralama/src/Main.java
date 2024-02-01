

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner giris = new Scanner(System.in);

        System.out.print("A Sayıyı Giriniz: ");
        a = giris.nextInt();

        System.out.print("B Sayıyı Giriniz: ");
        b = giris.nextInt();

        System.out.print("C Sayıyı Giriniz: ");
        c = giris.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("c > b > a");
            } else {
                System.out.print("b > c > a");
            }
        } else if ((b < a) && (c < a)) {
            if (b < c) {
                System.out.print("a > c > b");
            } else {
                System.out.print("a > b > c");
            }
        } else if ((b < c) && (a < c)) {
            if (a < b) {
                System.out.print("c > b > a");
            } else {
                System.out.print("c > a > b");
            }
        }
    }
}
