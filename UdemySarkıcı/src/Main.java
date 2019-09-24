import java.util.Scanner;

public class Main {

	
	private static Sarkicilar sarkici=new Sarkicilar();
	private static Scanner scan=new Scanner(System.in);
	public static void islemleri_bastir()
	{
		
		String islemler="1.Ýþlemleri Görüntüle\n"
				+ "2.Þarkýcýlarý Göster\n"
				+ "3.Þarkýcý Ekle\n"
				+ "4.Þarkýcý Sil\n"
				+ "5.Þarkýcý Güncelle\n"
				+ "6.Þarkýcý Ara\n"
				+ "7.Çýkmak için q ya basýn\n";
		
		System.out.println(islemler);
				
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
			
			islemleri_bastir();
			
			while(true)
			{
				System.out.println("Ýþlem seçiniz..");
				String islem=scan.nextLine();
				
				if(islem.equals("q"))
				{
					System.out.println("Çýkýlýyor..");
					break;
				}
				if(islem.equals("1"))
				{
					islemleri_bastir();
					System.out.println("_____________________________________");
				}
				else if(islem.equals("2"))
				{
					sarkici.sarkicilari_goster();
					System.out.println("_____________________________________");
				}
				else if(islem.equals("3"))
				{
					System.out.println("Eklemek istediðiniz þarkýcý..");
					String eklenecek_sarkici=scan.nextLine();
					sarkici.sarkici_ekle(eklenecek_sarkici);
					System.out.println("Þarkýcý eklendi....");
					System.out.println("_____________________________________");
				}
				else if(islem.equals("4"))
				{
					System.out.println("Silmek istediðiniz þarkýcý..");
					String silinecek_sarkici=scan.nextLine();
					sarkici.sarkici_sil(silinecek_sarkici);
					System.out.println("_____________________________________");
				}
				else if(islem.equals("5"))
				{
					System.out.println("Güncellemek istediðiniz indexxx...");
					int sira=scan.nextInt();
					scan.nextLine();
					System.out.println("Güncellemek istediðiniz þarkýcý ismi");
					String yeni_sarkici=scan.nextLine();
					sarkici.sarkici_guncelle((sira-1), yeni_sarkici);
					System.out.println("Þarkýcý güncellendi...");
					System.out.println("_____________________________________");
				}
				else if(islem.equals("6"))
				{
					System.out.println("Aramak istediðiniz þarkýcý.."); 
					String sarkici_ismi=scan.nextLine();
					sarkici.sarkici_ara(sarkici_ismi);
					System.out.println("_____________________________________");
				}
				else
				{
					System.out.println("Hatalý iþlem yaptýnýz.Tekrar deneyin...");
				    System.out.println("_____________________________________");
				    islemleri_bastir();
				    
				}
			}
		
		
		
		
		/*
		sarkici.sarkici_ekle("Murat");
		sarkici.sarkici_ekle("Tarkan");
		sarkici.sarkici_ekle("Ahmet");
		
		
		
		
		sarkici.sarkicilari_goster();
		
		
		sarkici.sarkici_guncelle(0, "Ýlker");
		
		
		sarkici.sarkici_sil("Ahmet");
		
		sarkici.sarkici_ekle("Mustafa");
		
		sarkici.sarkici_ara("Ýlkegr");
		
		
		*/
		
		
		
	}
	
	
	
	
	

}
