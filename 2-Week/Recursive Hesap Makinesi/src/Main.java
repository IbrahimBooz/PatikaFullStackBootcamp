import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static int topla() {

        System.out.print("ilk sayiyi giriniz:");
        int ilkSayi = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        int ikinciSayi = inp.nextInt();

        int sonuc = ilkSayi + ikinciSayi;
        System.out.println("Girilen Sayıların Toplamı: " + sonuc);
        return sonuc;
    }

    static int cikar() {

        System.out.print("ilk sayiyi giriniz:");
        int ilkSayi = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        int ikinciSayi = inp.nextInt();
        int sonuc = ilkSayi - ikinciSayi;
        System.out.println("Girilen Sayıların Farkı: " + sonuc);
        return sonuc;
    }

    static int carp() {
        System.out.print("ilk sayiyi giriniz:");
        int ilkSayi = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        int ikinciSayi = inp.nextInt();
        int sonuc = ilkSayi * ikinciSayi;
        System.out.println("Girilen Sayıların Carpımı: " + sonuc);
        return sonuc;
    }

    static double bol() {
        System.out.print("ilk sayiyi giriniz:");
        double ilkSayi = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        double ikinciSayi = inp.nextInt();
        if (ikinciSayi == 0) {
            System.out.println("İkinci Sayi 0 olamaz.");
            return 0;
        } else {
            double sonuc = ilkSayi / ikinciSayi;
            System.out.println("Girilen Sayılarım Bölümü: " + sonuc);
            return sonuc;
        }
    }

    static int usHesap() {

        System.out.print("Taban Giriniz: ");
        int taban = inp.nextInt();
        System.out.print("Üs Giriniz: ");
        int us = inp.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;

        }
        System.out.println("Sonuç : " + sonuc);
        return sonuc;

    }

    static int fak() {

        System.out.print("Faktöriyel Hesabı için Değer Giriniz: ");
        int a = inp.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc *= i;
        }
        System.out.println("girilen sayının faktöriyeli: " + sonuc);
        return sonuc;
    }

    static int mod() {
        System.out.print("Hangi sayıyın modunu almak istiyorsunuz:");
        int a = inp.nextInt();
        System.out.print("modu giriniz:");
        int b = inp.nextInt();

        int sonuc = a % b;
        System.out.println(a + "'nin " + b + " 'ye modu " + sonuc);
        return sonuc;
    }

    static void dikdort() {
        System.out.print("Kısa kenarı kaç cm:");
        int a = inp.nextInt();
        System.out.print("Uzun kenar kaç cm:");
        int b = inp.nextInt();


        System.out.println("Dikdörtgenin çevresi " + (2 * (a + b)));
        System.out.println("Dikdörtgenin Alanı " + (a * b));


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int select;
        String menu = " \n1- Toplama İşlemi\n"
                + "\n2- Çıkarma İşlemi\n"
                + "\n3- Çarpma İşlemi\n"
                + "\n4- Bölme işlemi\n"
                + "\n5- Üslü Sayı Hesaplama\n"
                + "\n6- Faktoriyel Hesaplama\n"
                + "\n7- Mod Alma\n"
                + "\n8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "\n0- Çıkış Yap";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir işlem türü seçiniz: ");
            select = inp.nextInt();
            if (select == 0) {
                break;
            } else if (select > 8) {
                System.out.println("Geçerli bir değer giriniz: ");
            } else {
                switch (select) {
                    case 1:
                        topla();
                        break;
                    case 2:
                        cikar();
                        break;
                    case 3:
                        carp();
                        break;
                    case 4:
                        bol();
                        break;
                    case 5:
                        usHesap();
                        break;
                    case 6:
                        fak();
                        break;
                    case 7:
                        mod();
                        break;
                    case 8:
                        dikdort();
                        break;
                }

            }
        }


    }
}
