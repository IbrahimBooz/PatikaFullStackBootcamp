import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inpt = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        a =inpt.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        b =inpt.nextInt();
        System.out.print("3.Kenarı Giriniz:");
        c =inpt.nextInt();
        double cevre = (a+b+c)/2,
                alan = cevre*((cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Ücgenin Cevresi:" + cevre);
        System.out.print("Ücgenin Alanı:" + Math.sqrt(alan));

    }
}