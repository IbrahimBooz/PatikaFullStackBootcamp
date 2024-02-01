
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz:");
        ilkKenar = girdi.nextInt();

        System.out.print("2. Kenarı Giriniz:");
        ikinciKenar = girdi.nextInt();

        double  ilkKenarIslem = ilkKenar*=ilkKenar,
                ikinciKenarIslem = ikinciKenar*=ikinciKenar;

        double Hip= (ilkKenarIslem+ikinciKenarIslem);

        System.out.print(Math.sqrt(Hip));

    }
}