import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin yüksekliğini belirlemek için bir sayı giriniz: ");
        k = inp.nextInt();

        for (int i = k; i >= 1; i--) {
            // Boşlukları bas
            for (int n = k; n > i; n--) {
                System.out.print(" ");
            }

            // Yıldızları bas
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }
    }
}
