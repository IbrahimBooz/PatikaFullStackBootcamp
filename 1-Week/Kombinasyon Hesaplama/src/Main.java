//Bu paket BigInteger değişkenini kullanmak için yüklenildi.
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kombinasyon için n'i giriniz: ");
        n = inp.nextInt();
        System.out.print("Kombinasyon için r'i giriniz: ");
        r = inp.nextInt();
//Kombinasyonda büyük sayıları hesaplayabilmek için BigInteger değişkenini kullandım.
        BigInteger nToplam = BigInteger.ONE;
        BigInteger rToplam = BigInteger.ONE;

        // n faktöriyel hesaplaması
        for (int i = 1; i <= n; i++) {
            nToplam = nToplam.multiply(BigInteger.valueOf(i));
        }

        // r faktöriyel hesaplaması
        for (int k = 1; k <= r; k++) {
            rToplam = rToplam.multiply(BigInteger.valueOf(k));
        }

        BigInteger nMinusRToplam = BigInteger.ONE;

        // (n - r) faktöriyel hesaplaması
        for (int j = 1; j <= (n - r); j++) {
            nMinusRToplam = nMinusRToplam.multiply(BigInteger.valueOf(j));
        }

        // Kombinasyon hesabı
        BigInteger gToplam = nToplam.divide(rToplam.multiply(nMinusRToplam));
        System.out.println("C(" + n + ", " + r + ") = " + gToplam);
    }
}
