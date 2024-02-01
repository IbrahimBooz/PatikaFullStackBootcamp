import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayiAdet;
        System.out.print("Kaç adet sayi gireceksiniz: ");
        sayiAdet=inp.nextInt();

        /*İstediğimiz değerleri yakalayabilmek değişken tanımladık. Tanımlanan     değişkenlerde istedğimiz değerleri tutabilmek için 1 değeri verdik.        Vermezsek içine yeni değer atayamayız.*/
        int enKucuk=1;
        int enBuyuk=1;
        //Negatif değer girilirse programı durdurmak için bu koşulu ekledik.
        if(sayiAdet<0) {
            System.out.print("En az bir sayı girmelisiniz.");
            return;
        }
        //Kaç adet giriş olacağını bu döngüde yakalıyoruz.
        for(int i=1; i<=sayiAdet; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi=inp.nextInt();

            if(sayi<enKucuk)
            {
                enKucuk=sayi;
            }

            if(sayi>enBuyuk)
            {
                enBuyuk=sayi;
            }

        }
        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("En büyük sayı: " + enBuyuk);

    }
}
