import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int ay,gun;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Sayı ile Giriniz: ");
        ay = inp.nextInt();
        System.out.print("Doğduğunuz Günü Sayı İle Giriniz:");
        gun = inp.nextInt();

        if((ay==1 && gun<22) || (ay==12 && gun>21)) {
            System.out.print("Burcunuz Oglaktır");
        } else if((ay==1 && (gun<30 &&gun>22)) || (ay==2 && gun<19)){
            System.out.print("Burcunuz Kovadır.");
        }else if ((ay==2 && (gun<30 &&gun>20)) || (ay==3 && gun<20)){
            System.out.print("Burcunuz Balıktır.");
        }else if ((ay==3 && (gun<30 &&gun>20)) || (ay==4 && gun<20)){
            System.out.print("Burcunuz Koçtur.");
        }else if ((ay==4 && (gun<30 &&gun>21)) || (ay==5 && gun<21)){
            System.out.print("Burcunuz Boğadır.");
        }else if ((ay==5 && (gun<30 &&gun>22)) || (ay==6 && gun<22)){
            System.out.print("Burcunuz İkizlerdir.");
        }else if ((ay==6 && (gun<30 &&gun>23))|| (ay==7 && gun<22)){
            System.out.print("Burcunuz Yengeçtir.");
        }else if ((ay==7 && (gun<30 && gun >23)) || (ay==8 && gun<22)){
            System.out.print("Burcunuz Aslandır.");
        }else if ((ay==8 && (gun<30 &&gun>23)) || (ay==9 && gun<22)){
            System.out.print("Burcunuz Başaktır.");
        }else if ((ay==9 && (gun<30 &&gun>23)) || (ay==10 && gun<22)){
            System.out.print("Burcunuz Terazidir.");
        }else if ((ay==10 && (gun<30 &&gun>23)) || (ay==11 && gun<21)){
            System.out.print("Burcunuz Akreptir.");
        }else {
            System.out.print("Böyle bir tarih yok.");
        }
    }
}
