import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Değişken tanımlanması
        int a,b,c,toplam;
        //Veri girişinin yapılması
        System.out.print(" A Sayi Giriniz: ");
        a=scan.nextInt();

        System.out.print(" B Sayi Giriniz: ");
        b=scan.nextInt();

        System.out.print(" C Sayi Giriniz: ");
        c=scan.nextInt();
        //Girilen değerlerin hesaplanması
        toplam=a+b*c-b;
        //Sonucu ekrana bastırılması
        System.out.print( " (" +  a + " + " + b +  " * " + c + " - " + b + ") --> " + " İşlem Sonucu: "+ toplam);
    }
}