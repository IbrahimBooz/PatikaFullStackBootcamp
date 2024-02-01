import java.util.Scanner;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan MAtris sınırını belirlemek için değer alıyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Satır Sayısını Giriniz: ");
        int k = inp.nextInt();
        System.out.print("Dizinin Sütun Sayısını Giriniz: ");
        int j = inp.nextInt();

        //Alınan değerleri Ekrana yazdırıyoruz.
        int[][] diziGir = new int[k][j];

        for (int i = 0; i < k; i++) {

            for (int a = 0; a < j; a++) {

                System.out.print("Dizi elemanını giriniz (" + i + "," + a + "): ");
                diziGir[i][a] = inp.nextInt();
            }

            System.out.println();

        }
        //Alınan değerleri Ekrana Matris halinde yazdırmak için döngü kullanıyoruz.
        System.out.println("Girilen Dizi:");
        for (int i = 0; i < k; i++) {

            for (int a = 0; a < j; a++) {
                System.out.print(diziGir[i][a] + " ");
            }

            System.out.println();

        }
        // Ekrana Matrisin Transpouzunu yazmak için yeni bir dizi değişkeni tanımlıyoruz. Satır ve sütunların yerini değiştiriyoruz.

        int[][] transpozDizi = new int[j][k];
        //Burada döngü sınırlarının yerini değiştiriyoruz.
        for (int i = 0; i < k; i++) {

            for (int a = 0; a < j; a++) {

                transpozDizi[a][i] = diziGir[i][a];
            }

        }

        System.out.println("Matrisin Transpozu:");

        for (int i = 0; i < j; i++) {

            for (int a = 0; a < k; a++) {

                System.out.print(transpozDizi[i][a] + " ");
            }
            System.out.println();
        }
    }
}
