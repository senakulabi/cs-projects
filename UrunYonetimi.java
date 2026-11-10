import java.util.Scanner;

class Urun {
    private String urunAdi;
    private double fiyat;
    private int stok;

    public Urun(String urunAdi, double fiyat, int stok) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStok() {
        return stok;
    }

    public void bilgileriYazdir() {
        System.out.println("\n--- Ürün Bilgisi ---");
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("Fiyat   : " + fiyat + " TL");
        System.out.println("Stok    : " + stok + " adet");
    }
}

public class UrunYonetimi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Ürün adı giriniz: ");
        String ad = girdi.nextLine();

        System.out.print("Ürün fiyatı giriniz: ");
        double fiyat = girdi.nextDouble();

        System.out.print("Stok miktarı giriniz: ");
        int stok = girdi.nextInt();

        Urun yeniUrun = new Urun(ad, fiyat, stok);
        yeniUrun.bilgileriYazdir();

        girdi.close();
    }
}
