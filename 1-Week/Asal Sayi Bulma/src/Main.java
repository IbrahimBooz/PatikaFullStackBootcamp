import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();

        System.out.println("1 ile " + n + " arasındaki asal sayılar:");
        //Girilen sayı Kadar döngünün dönmesi için sınırımıza (i<=n) yazdık.
        for (int i =2; i<=n; i++) {
            //Sayının bölenlerini yakalamak için boolean değişkeni atadık.
            boolean isTrue= true;
            // Döngüde aynı sayıyı tekrarlayarak yazmaması izin Math.sqrt kullandık.
            for (int j =2 ; j<=Math.sqrt(i); j++){

                if (i%j ==0) {
                    //Eğer sayının katları varsa boolean false oldu ve break ile döngüyü kırarak çıktık.
                    isTrue=false;
                    break;
                }
            }
            //Döngüyü kırmadığı zaman Asal sayımız oluyor. Sayıyı yakalayıp yazdırmak için bu koşulu kullandık.
            if(isTrue) {
                System.out.print(" "+ i);
            }

        }

    }
}

