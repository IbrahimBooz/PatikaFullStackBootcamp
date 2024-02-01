import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double kg, boy, indeks;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy=giris.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kg=giris.nextDouble();
        indeks= kg/(boy*=boy);
        System.out.print("Vücut Kitle İndeksiniz:"+ indeks);
    }
}