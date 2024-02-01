import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b;
        int ebob=1;
        int ekok=1;
        Scanner giris = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        a=giris.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        b=giris.nextInt();

        for (int i=1; i<=a; i++) {
            if(a%i==0 && b%i==0){
                ebob=i;
            }

        }
        System.out.println(ebob +"ebob");
        ekok=((a*b)/ebob);
        System.out.print(ekok +"ekok");
    }


}