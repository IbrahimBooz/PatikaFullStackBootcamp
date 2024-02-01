import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double
                armut=2.14,
                elma=3.67,
                domates=1.11,
                muz=0.95,
                patlican=5,
                toplam;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç kilo Armut aldınız:");
        double armutKilo =inp.nextDouble();
        System.out.print("Kaç kilo Elma aldınız:");
        double elmaKilo =inp.nextDouble();
        System.out.print("Kaç kilo Domates aldınız:");
        double domatesKilo =inp.nextDouble();
        System.out.print("Kaç kilo Muz aldınız:");
        double muzKilo =inp.nextDouble();
        System.out.print("Kaç kilo Patlıcan aldınız:");
        double patlicanKilo =inp.nextDouble();

        toplam =((armutKilo*armut)+(elma*elmaKilo)+(domates*domatesKilo)+(muzKilo+muz)+(patlican*patlicanKilo));
        System.out.print("Toplam Ödemeniz Tutar:" + toplam + " TL");


    }
}