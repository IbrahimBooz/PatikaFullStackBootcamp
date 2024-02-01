import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        double km, yas, yTipi, tarife = 0.1, tutar, cIndirim, gIndirim, yIndirim;
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan verileri atalar tanımladığımız değişkenlere atadık.
        System.out.print("Mesafeyi km türünden giriniz:");
        km = inp.nextDouble();

        System.out.print("Yolculuk tipini seçiniz:\n1-Tek Yön\n2-Gidiş- Dönüş\nSeçiminiz:");
        yTipi = inp.nextDouble();

        System.out.print("Yaşınızı giriniz:");
        yas = inp.nextDouble();


        tutar = (tarife * km);
        // Km yolculuk tipi ve yası iç içe iflerle koşullara uyuyor mu kontrol ediyoruz.
        if (km > 0) {
            if (yTipi == 1) {
                if ((0 <= yas) && (yas <= 12)) {
                    cIndirim = tutar * 0.5;
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nÇocuk İndirimli Bilet fiyatınız: " + cIndirim);
                } else if ((12 < yas) && (yas <= 24)) {
                    gIndirim = tutar * 0.9;
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nGenç İndirimli Bilet fiyatınız: " + gIndirim);
                } else if (yas > 24) {
                    System.out.print("Normal Bilet Fiyatı:" + tutar);
                } else if (65 <= yas) {
                    yIndirim = tutar * 0.7;
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nYaşlı İndirimli Bilet fiyatınız: " + yIndirim);
                } else {
                    System.out.print("Hatalı Yaş Girdiniz:");
                }

            } else if (yTipi == 2) {
                if ((0 < yas) && (yas <= 12)) {
                    cIndirim = ((tutar * 0.5) * 0.8);
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nÇocuk İndirimli Bilet fiyatınız: " + cIndirim);
                } else if ((12 < yas) && (yas <= 24)) {
                    gIndirim = ((tutar * 0.9) * 0.8);
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nGenç İndirimli Bilet fiyatınız: " + gIndirim);
                } else if (yas > 24) {
                    System.out.print("Normal Bilet Fiyatı:" + tutar);
                } else if (65 <= yas) {
                    yIndirim = (tutar * 0.7) * 0.8;
                    System.out.print("Normal Bilet Fiyatı:" + tutar + "\nYaşlı İndirimli Bilet fiyatınız: " + yIndirim);
                } else {
                    System.out.print("Hatalı Yaş Girdiniz:");
                }
            } else {
                System.out.print("Hatalı Yolculuk Tİpi Girdiniz:");
            }
        } else {
            System.out.print("Hatalı Km Girdiniz");
        }
    }
}
