import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int dTarih;
        //Kullanıcıdan Veri almak için yazdık.
        Scanner inp = new Scanner(System.in);
        System.out.print("Çin Zodyağı Burcunuz İçin Doğum Yılınızı Giriniz:");
        dTarih =inp.nextInt();
        // Doğum tarihin kalanını bulmak için ,%12== şekilde belirledik.
        if(dTarih %12==0){
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        }else if (dTarih %12==1){
            System.out.print("Çin Zodyağı Burcunuz: Horoz");
        }else if (dTarih %12==2){
            System.out.print("Çin Zodyağı Burcunuz: Köpek");
        }else if (dTarih %12==3){
            System.out.print("Çin Zodyağı Burcunuz: Domuz");
        }else if (dTarih %12==4){
            System.out.print("Çin Zodyağı Burcunuz: Fare");
        }else if (dTarih %12==5){
            System.out.print("Çin Zodyağı Burcunuz: Öküz");
        }else if (dTarih %12==6){
            System.out.print("Çin Zodyağı Burcunuz: Kaplan");
        }else if (dTarih %12==7){
            System.out.print("Çin Zodyağı Burcunuz: Tavşan");
        }else if (dTarih %12==8){
            System.out.print("Çin Zodyağı Burcunuz: Ejderha");
        }else if (dTarih %12==9){
            System.out.print("Çin Zodyağı Burcunuz: Yılan");
        }else if (dTarih %12==10){
            System.out.print("Çin Zodyağı Burcunuz: At");
        }else if (dTarih %12==11){
            System.out.print("Çin Zodyağı Burcunuz: Koyun");
        }else {
            System.out.print("Doğum Tarihiniz Sadece Yıl olarak Giriniz");
        }
    }
}