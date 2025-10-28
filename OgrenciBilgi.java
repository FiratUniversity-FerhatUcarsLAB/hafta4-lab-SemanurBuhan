/*
	* Ad Soyad: SEMANUR BUHAN
	* Ogrenci No: 250541007
	* Tarih: 25.10.2025
	* Aciklama: Ogrenci Bilgi Sistemi (Gorev 1)
	*/
	import java.util.Scanner;

	public class OgrenciBilgi {
	    public static void main(String[] args) {

	        // Scanner çağırıldı

	        Scanner input = new Scanner(System.in);

	        // Ad ataması yaptık
	        
	        System.out.print("Adınızı Giriniz: ");
	        String ad = input.nextLine();
	        

	        System.out.print("Soyadınızı Giriniz: ");
	        String soyad = input.nextLine();


	        // yaş ve öğrenci numarasına geçtik

	        System.out.print("Öğrenci Numaranızı Giriniz: ");
	        int ogrNo = input.nextInt();


	        System.out.print("Yaşınızı Giriniz: ");
	        int yas = input.nextInt();

	        // GPA bilgisi alındı

	        System.out.print("GPA (0.00-4.00): ");
	        double gpa = input.nextDouble();

	        String durum = (gpa >= 2.0) ? "Basarili Ogrenci" : "Tekrar Deneyin";


	         System.out.println("===ÖĞRENCİ BİLGİ SİSTEMİ===");
	         System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
	         System.out.printf("Öğrenci Numaranız: %d\n", ogrNo);
	         System.out.printf("Yaşınız: %d\n", yas);
	         System.out.printf("GPA: %.2f\n", gpa);
	         System.out.printf("Durum: %s\n", durum);

	         input.close();
	       }
	    }

