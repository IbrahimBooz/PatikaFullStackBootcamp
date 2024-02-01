import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double taksiMetre=2.20,yol,acilis=10, temelUcret=20;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç KM yol gittiniz:");
        yol=girdi.nextDouble();
        double ucret = (yol*taksiMetre)+acilis;
        Double odenecekTutar = ucret <=20 ? temelUcret : ucret;
        System.out.println("Gidilen Yol:"+ yol);
        System.out.println("KM başına ücretlendirme:"+ taksiMetre);
        System.out.println("Taksimetre Acılıs Ücreti:"+ acilis);
        System.out.println("Toplam TL:"+ odenecekTutar);

    }
}