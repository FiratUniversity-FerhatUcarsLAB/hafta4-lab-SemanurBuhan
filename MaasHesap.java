/*
* Ad Soyad: SEMANUR BUHAN
* Ogrenci No: 250541007
* Tarih: 28.10.2025
* Aciklama: Maas Hesaplama (Gorev 3)
*/
   import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        
        // Scanner çağırıldı

        Scanner input = new Scanner (System . in );

        System.out.print("Çalışan Adı: ");
        String ad = input.nextLine();

        System.out.print("Çalışan Soyadı: ");
        String soyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutmaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati:");
        int calismasaati = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaisaati = input.nextInt();

        // Gelir Bilgileri Girildi

        double mesaiucreti = (brutmaas/160 * mesaisaati * 1.5);
        double toplamgelir = brutmaas + mesaiucreti;
       

        // Kesintiler Hesaplandı

        final double SGK_ORANI = 0.14;
        final double GELİR_VERGİSİ_ORANI = 0.15;
        final double DAMGA_VERGİSİ_ORANI = 0.0759;

        double sgkKesintisi = toplamgelir * SGK_ORANI;
        double gelirVergisi = toplamgelir * GELİR_VERGİSİ_ORANI;
        double damgaVergisi = toplamgelir * DAMGA_VERGİSİ_ORANI;
        double toplamkesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        

        // Hesaplanacak İstatikler

        
        double kesintiOrani = (toplamkesinti / toplamgelir) * 100;

        double saatlikNetKazanc = (toplamgelir - toplamkesinti) / (calismasaati );
      
        double gunlukNetKazanc =  (toplamgelir - toplamkesinti) / (calismasaati );
        
        double toplamKesinti = SGK_ORANI + GELİR_VERGİSİ_ORANI + DAMGA_VERGİSİ_ORANI;
        
        double netmaas = toplamgelir - toplamkesinti;
        


        // Tablo Son Halini Aldı
        System.out.println();
        System.out.println("=============================");
        System.out.println("MAAŞ BARDROSU");
        System.out.println("=============================");
         
        System.out.printf("Çalışan Adı-Soyadı: %s %s\n", ad, soyad);
        System.out.println();
        System.out.println("GELİRLER");
        System.out.println();
        System.out.printf("Brüt Maaş: %.2f TL\n", brutmaas);
        System.out.printf("Mesai Ücreti: %.2f TL\n", mesaiucreti);
        System.out.printf("Toplam Gelir: %.2f TL\n", toplamgelir);
        System.out.println("----------------------------");
        System.out.println("KESİNTİLER");
        System.out.println();
        System.out.printf("SGK Kesintisi: %.2f TL\n", sgkKesintisi);
        System.out.printf("Gelir Vergisi: %.2f TL\n", gelirVergisi);
        System.out.printf("Damga Vergisi: %.2f TL\n", damgaVergisi);
        System.out.println("----------------------------");
        System.out.println("İSTATİSTİKLER");
        System.out.println();
        System.out.printf("Kesinti Oranı: %.2f %%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç: %.2f TL\n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç: %.2f TL\n", gunlukNetKazanc);
        System.out.println("----------------------------");
        System.out.println();
        System.out.printf("Toplam Kesinti: %.2f TL\n", toplamKesinti);
        System.out.printf("Net Maaş: %.2f TL\n", netmaas);
        System.out.println("----------------------------");

       
      input.close(); 
  }
}


