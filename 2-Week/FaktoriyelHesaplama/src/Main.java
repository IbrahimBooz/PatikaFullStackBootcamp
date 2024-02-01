import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
             int a;
             int toplam=1;
             Scanner inp = new Scanner(System.in);
             System.out.print("Faktöriyel Hesaplamak için sayı giriniz:");
             a=inp.nextInt();

            //Döngünün ne kadar döneceğini i<a'da girdiğimiz sayı kadar olmasını belirttik.
            for (int i = 1; i <= a; i++) {
                toplam*=i;

            }
            //For'un dışına yazma sebebim, sadece girdiğim sayının ekranda gözükmesini istiyorum.
            System.out.println(a +"! =" + toplam);
    }
}