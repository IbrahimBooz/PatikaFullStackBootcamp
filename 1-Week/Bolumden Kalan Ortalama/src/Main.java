import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);

        System.out.print("Bir Sayı giriniz: ");
        sayi=giris.nextInt();
        //Döngüde Arttırmamız gereken değişkenleri burada belirledik.
        int toplam=0;
        int bolenSayi=0;

        for(int i =1; i<=sayi; i++){
            //Hem 3e hemde 4e bölünenlerin kosulu girdiğimiz yer
            if ((i %3==0) &&(i%4==0)){
                System.out.println("Hem 3'e Hem 4'e Bölünenler:"+i);
                System.out.println("-----------------------------");
                toplam+=i;
                bolenSayi++;
            }
        }
        System.out.print("Hem 3'e Hem 4'e Bölünenlerin Ortalaması: "+toplam/bolenSayi);
    }
}