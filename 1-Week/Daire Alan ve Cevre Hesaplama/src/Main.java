import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        double pi =3.14, yCap, mAci;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarı çapını giriniz:");
        yCap =inp.nextFloat();
        double alan =pi*yCap*yCap,
                cevre =2*pi*yCap;
        System.out.println("Dairenin Alanı:"+ alan);
        System.out.println("Dairenin Cevresi:"+ cevre);
        System.out.println( " Yarı çapı"+yCap +"\n olan Dairenin Merkez Açı Ölçüsünü Giriniz:");
        mAci=inp.nextDouble();
        double dDilim =(pi*(yCap*yCap)*mAci/360);
        System.out.println("Yarıçapı:"+ yCap +"\n olan ve Merkez Açı\n Ölçüsünün:"+mAci+ "\n olan Daire diliminin Alanı:"+ dDilim);


    }
}