import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        int b = 0; // Başlangıçta 'b' değişkenine değer atamadığımızda ekleme yapamayız..

        do {
            System.out.print("Sayi Giriniz:");
            a=inp.nextInt();
            //Toplayacağımız sayıların kriterlerini buraya girdik.
            if((a % 2 == 0) &&  (a % 4 == 0)) {
                b+=a;
            }
            //Döngünün  dönmesini sağlayan koşulu girdik.
        } while (a % 2==0);

        System.out.print(b);
    }
}
