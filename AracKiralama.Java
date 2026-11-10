import java.util.Scanner;

class Arac {
    private String plaka;
    private double gunlukUcret;
    private boolean kiradaMi;

    private static int toplamArac = 0;
    private static int kiradakiAracSayisi = 0;

    public Arac(String plaka, double gunlukUcret) {
        this.plaka = plaka;
        this.gunlukUcret = gunlukUcret;
        this.kiradaMi = false;
        toplamArac++;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public boolean isKiradaMi() {
        return kiradaMi;
    }

    public void aracKirala() {
        if (kiradaMi) {
            System.out.println("Hata: " + plaka + " plakalı araç zaten kirada!");
        } else {
            kiradaMi = true;
            kiradakiAracSayisi++;
            System.out.println(plaka + " plakalı araç başarıyla kiralandı.");
        }
    }

    public void aracIadeEt() {
        if (!kiradaMi) {
            System.out.println("Hata: " + plaka + " plakalı araç zaten kirada değil!");
        } else {
            kiradaMi = false;
            kiradakiAracSayisi--;
            System.out.println(plaka + " plakalı araç iade edildi.");
        }
    }

    public void bilgileriYazdir() {
        System.out.println("Plaka: " + plaka + " | Günlük Ücret: " + gunlukUcret + " TL | Durum: " + (kiradaMi ? "Kirada" : "Uygun"));
    }

    public static void sistemOzetiniYazdir() {
        System.out.println("--- Sistem Özeti ---");
        System.out.println("Toplam Araç Sayısı: " + toplamArac);
        System.out.println("Kiradaki Araç Sayısı: " + kiradakiAracSayisi);
    }
}

public class AracKiralama {
    public static void main(String[] args) {
        Arac arac1 = new Arac("34 ABC 123", 750.0);
        Arac arac2 = new Arac("17 XYZ 456", 1200.0);

        arac1.bilgileriYazdir();
        arac2.bilgileriYazdir();

        System.out.println("\n--- İşlemler ---");
        arac1.aracKirala();
        arac1.aracKirala(); // İkinci kez kiralamayı dener
        
        System.out.println();
        Arac.sistemOzetiniYazdir();
    }
}
