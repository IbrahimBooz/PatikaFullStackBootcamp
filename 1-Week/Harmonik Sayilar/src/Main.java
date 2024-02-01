import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a;
        double toplam=0.0;
        System.out.print("Bir sayi giriniz: ");
        a=scan.nextInt();

        for (int i =1; i<=a; i++) {
            //int'i inte böldüğümüz için 1.0 çıkıcaktır. Bu sebeple 1.0/i olarak girdik.
            toplam+=(1.0/i);
            System.out.println(toplam);

        }


    }
}