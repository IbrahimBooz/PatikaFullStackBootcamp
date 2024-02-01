import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        //Random sayılarla Matris DOldurma
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = (int) (Math.random() * 100);
                System.out.println(matris[i][j]);
            }

        }//Matrisin Transpoz alma İşlemi
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Dizi Elemanlarının Ort Alma işlemi

        int[] dizi1 = {5, 3, 7, 334, 85, 2};
        int topla = 0;
        System.out.println("Dizi Elemanları " + Arrays.toString(dizi1));
        for (int i = 0; i < dizi1.length; i++) {
            topla += (1 + dizi1[i]);

        }
        System.out.println("Ortalama " + topla / dizi1.length);


    }
*/
        /*
        //Dizide ki Min ve Max Değer Bulma

        int[] dizi2 = {5, 423, 6, 2, -6, -76, 123 - 56};

        int min = dizi2[0];
        int max = dizi2[0];

       for (int i: dizi2){

            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("En Küçük Değer: " + min);
        System.out.println("En Büyük Değer: " + max);
    }

         */
/*
        // Dizi boyutu belirleme ve dizi sıralama
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int k = inp.nextInt();
        int[] diziGir = new int[k];
        System.out.println("Dizinin Elemanlarını Giriniz: ");

        for (int i = 0; i < diziGir.length; i++) {
            diziGir[i] = inp.nextInt();
            System.out.println(i + ".Eleman: " + diziGir[i]);
        }
        Arrays.sort(diziGir);
        System.out.println(Arrays.toString(diziGir));

    }*/


    }
}
