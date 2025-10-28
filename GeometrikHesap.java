/*
* Ad Soyad: SEMANUR BUHAN
* Ogrenci No: 250541007
* Tarih: 25.10.2025
* Aciklama: Geometrik Hesaplamalar (Gorev 2)
*/

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        // Scanner çağırıldı

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        float yarıcap = input.nextFloat();

        float pi = 3.14159f;
        double alan = pi * yarıcap * yarıcap;
        double cevre = 2 * pi * yarıcap;
        double hacim = (4.0 / 3.0) * pi * yarıcap * yarıcap * yarıcap;
        double yuzeyAlani = 4 * pi * yarıcap * yarıcap;

        System.out.println("Sonuçlar:");
        System.out.println("--------------------");
        System.out.printf("Dairenin Alanı: %.2f\n", alan);
        System.out.printf("Dairenin Çevresi: %.2f\n", cevre);
        System.out.printf("Kürenin Hacmi: %.2f\n", hacim);
        System.out.printf("Kürenin Yuzey Alanı: %.2f\n", yuzeyAlani);

        input.close();        
      }
    }


