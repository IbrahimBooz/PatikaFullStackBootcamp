import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double mat,fizik,kimya,muzik,turkce,toplam=0,notSayisi=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat=input.nextDouble();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik=input.nextDouble();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya=input.nextDouble();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik=input.nextDouble();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce=input.nextDouble();

        if (mat>= 0 && mat <= 100) {
            notSayisi++;
            toplam+=mat;
        }
        if (fizik>= 0 && fizik <= 100) {
            notSayisi++;
            toplam+=fizik;
        }
        if (kimya>= 0 && kimya <= 100) {
            notSayisi++;
            toplam+=kimya;
        }
        if (muzik>= 0 && muzik <= 100) {
            notSayisi++;
            toplam+=muzik;
        }
        if (turkce>= 0 && turkce <= 100) {
            notSayisi++;
            toplam+=turkce;
        }

        double ort=(toplam/notSayisi);
        if((ort)>=55) {
            System.out.print("Tebrikler Sınıfı Geçtiniz: " + "Ortalamanız:" +ort);
        } else {
            System.out.print("Ortalamanız:" +ort + "\nKaldınız.." );
        }

    }
}