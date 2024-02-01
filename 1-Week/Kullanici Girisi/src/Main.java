import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        String userName,password;
        Scanner input =new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = input.next();

        System.out.print("Şifrenizi Giriniz:");
        password=input.next();

        if(userName.equals("Java") && password.equals("Patika123"))
        {
            System.out.print("Girişiniz Başarıyla Gerçekleşmiştir !");
        } else {
            System.out.println("Verileriniz Hatalıdır.");
            System.out.print("Şifrenizi Değiştirmek İster Misiniz? \n1-Evet\n2-Hayır\n");
            int secim=input.nextInt();
            if (secim == 1) {
                System.out.print("Yeni Şifrenizi Giriniz:");
                String yeniSifre = input.next();
                if(yeniSifre.equals("Patika123")) {
                    System.out.print("Eski Şifre Girdiğiniz için Şifreniz Değiştirilemez !");
                } else {
                    System.out.print("Şifreniz Oluşturulmuştur.");
                }
            } else {
                System.out.print("Şifre Değişikliği Gerçekleştirilememiştir !");
            }
        }


    }
}