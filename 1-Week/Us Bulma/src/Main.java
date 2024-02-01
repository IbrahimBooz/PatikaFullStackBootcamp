import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static int pow() {
        System.out.print("Bir taban Giriniz: ");
        int taban = inp.nextInt();
        System.out.print("Bir Üs Giriniz: ");
        int us = inp.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        return sonuc;
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("Sonuc: " + pow());
        }
    }
}
