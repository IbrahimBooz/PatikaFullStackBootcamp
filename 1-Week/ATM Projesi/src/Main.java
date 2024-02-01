import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int hak = 3;
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int secim, pYatirma, pCekme;
        int bakiye = 3000;

        //Kullanıcıya verilen hakkı while döngüsü ile yönetebiliriz.
        while (hak > 0) {
            //Kullanıcıdan istenilen parametreleri alırız.
            System.out.print("Kullanıcı Adını Giriniz: ");
            userName = inp.nextLine();

            System.out.print("Şifrenizi Giriniz: ");
            password = inp.nextLine();
            //Burada ki koşulda userName ve password kontrolu sağlanır.
            if ((userName.equals("Patika")) && (password.equals("ibra123"))) {
                System.out.print("Başarılı bir şekilde girişyaptınız!\n\n");
            /*İf bloğu çalışırsa buraya gelerek menü seçimi yapmasını sağlarız.
              Burada do while kullanmamızın sebebi döngünün içine koşulsuz
              çalıştırmasıdır.*/
                do {

                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz:\n"
                            + "1-Para Yatırma\n"
                            + "2-Para Çekme\n"
                            + "3-Bakiye Sorgulama\n"
                            + "4-Çıkış\n");
                    secim = inp.nextInt();
                    //Bu döngülerde menü seciminden gelen değerle işlemlerimizi                          yaparız.
                    if (secim == 1) {
                        System.out.print("Yatırmak istediğiniz tutarı yazınız: ");
                        pYatirma = inp.nextInt();
                        bakiye += pYatirma;
                        System.out.print("Güncel Bakiyeniz: " + bakiye + "TL");
                        break;
                    }
                    if (secim == 2) {
                        System.out.print("Çekmek istediğiniz tutarı yazınız: ");
                        pCekme = inp.nextInt();
                        if (pCekme < bakiye) {

                            bakiye -= pCekme;
                            System.out.print("Güncel Bakiyeniz: " + bakiye + "TL");
                        } else {
                            System.out.print("Bakiyeniz Yeterli Değildir!");
                            break;
                        }
                        break;
                    }
                    if (secim == 3) {
                        System.out.print("Güncel Bakiyeniz: " + bakiye + "TL");
                        break;

                    }
                    if (secim > 4) {
                        System.out.print("Böyle Bir menü yoktur.");
                        break;
                    }

                } while (secim != 4);
                break;
                //Kullanıcı bilgileri yanlışsa burada else kısmında hakkından bir                   bir azaltırız.
            } else {
                System.out.print("Bilgileriniz Yanlıştır.\n");
                hak--;
                //Hak ==0 olduğunda kullanıcıyı sistemden atmak için aşağıda ki                     koşul oluşturulmuştur.
            }
            if (hak == 0) {
                System.out.print("Şifreniz Bloke olmuştur.");
            }
        }
    }
}