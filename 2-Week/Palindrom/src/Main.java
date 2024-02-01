
import java.util.Scanner;

class Main {


    static boolean isPalindrom(int number) {
        int newNumber = number;
        int lastNumber, reverseNumber = 0;

        while (newNumber != 0) {
            lastNumber = newNumber % 10;
            System.out.println("son basamak" + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;

            newNumber /= 10;
            System.out.println("yeni sayı" + newNumber);

            System.out.println(reverseNumber);

        }


        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(54677645));
    }
}