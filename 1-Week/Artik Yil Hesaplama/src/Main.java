import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int yil;
        //Kullanıcıdan Veri alma
        Scanner giris=new Scanner (System.in);
        System.out.print("Yıl Giriniz: ");
        yil=giris.nextInt();

        //Artık yıl kosulu belirlemek için mod kullandık.
        if((yil%4==0 || yil%100!=0) &&(yil%400==0)){
            System.out.print(yil+"Yılı Artık Yıldır.");
        }else {
            System.out.print(yil+"Yılı Artık Yıl Değildir.");
        }

    }
}