import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        double tutar, kdv = 0.18;
        System.out.print("Ücreti Giriniz:");
        Scanner inp = new Scanner(System.in);
        tutar = inp.nextDouble();
        Double kdvtutar = tutar >= 1000 ? (tutar * kdv) : (tutar * 0.08);

        System.out.print("Ödeyeceğiniz KDV Tutarı:" + kdvtutar);

    }
}