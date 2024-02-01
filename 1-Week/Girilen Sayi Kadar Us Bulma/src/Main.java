
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scan =new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        a=scan.nextInt();

        //2 farklı döngüyü her bir kriter için ayrı ayrı döndürmek için 2 farklı for kullandık.
        for(int i =1; i<=a; i*=4) {

            System.out.println(  "Girilen "+ a +" sayısına kadar olan 4'ün üsleri: " + i);

        }
        System.out.println("----------------------");
        for(int k =1; k<=a; k*=5){
            System.out.println( "Girilen "+ a +" sayısına kadar olan 5'ün üsleri: " + k);
        }
    }
}