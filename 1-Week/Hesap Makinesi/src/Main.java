import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int n1,n2,secim;

        Scanner giris = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 =giris.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 =giris.nextInt();

        System.out.print("Yapmak İstediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Carpma\nSeciminiz:");
        secim=giris.nextInt();
        switch(secim){
            case 1:
                System.out.print("İki Sayının Toplamı: " +(n1+n2));
                break;
            case 2:
                System.out.print("İki Sayının Farkı: " +(n1-n2));
                break;
            case 3:
                System.out.print("İki Sayının Bölümü: " +(n1/n2));
                break;
            case 4:
                System.out.print("İki Sayının Çarpımı: " +(n1*n2));
                break;
            default:
                System.out.print("Geçerli Bir değer giriniz!");
                break;
        }
    }
}