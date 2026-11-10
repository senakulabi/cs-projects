import java.util.Scanner;

class BankaHesabi {
    private String hesapSahibi;
    private String hesapNo;
    private double bakiye;

    private static int toplamHesapSayisi = 0;
    private static double bankadakiToplamPara = 0;

    public BankaHesabi(String hesapSahibi, String hesapNo, double ilkBakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.bakiye = ilkBakiye;
        toplamHesapSayisi++;
        bankadakiToplamPara += ilkBakiye;
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            bankadakiToplamPara += miktar;
            System.out.println(miktar + " TL yatırıldı. Güncel bakiye: " + bakiye + " TL");
        }
    }

    public void paraCek(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Çekilmek istenen: " + miktar + " TL, Bakiye: " + bakiye + " TL");
        } else if (miktar > 0) {
            bakiye -= miktar;
            bankadakiToplamPara -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye + " TL");
        }
    }

    public void hesapOzeti() {
        System.out.println("Sayın " + hesapSahibi + ", " + hesapNo + " nolu hesabınızda " + bakiye + " TL bulunmaktadır.");
    }

    public static void bankaRaporu() {
        System.out.println("\n--- Banka Genel Raporu ---");
        System.out.println("Aktif Hesap Sayısı: " + toplamHesapSayisi);
        System.out.println("Bankadaki Toplam Para: " + bankadakiToplamPara + " TL");
    }
}

public class BankaUygulamasi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = girdi.nextLine();

        System.out.print("Hesap no girin: ");
        String no = girdi.nextLine();

        System.out.print("İlk bakiye girin: ");
        double bakiye = girdi.nextDouble();

        BankaHesabi hesap = new BankaHesabi(ad, no, bakiye);
        hesap.hesapOzeti();

        System.out.println();
        hesap.paraCek(200);
        hesap.paraYatir(600);
        hesap.hesapOzeti();

        BankaHesabi.bankaRaporu();

        girdi.close();
    }
}
