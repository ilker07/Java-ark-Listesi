import java.util.Scanner;

public class Main {

	
	private static Sarkicilar sarkici=new Sarkicilar();
	private static Scanner scan=new Scanner(System.in);
	public static void islemleri_bastir()
	{
		
		String islemler="1.��lemleri G�r�nt�le\n"
				+ "2.�ark�c�lar� G�ster\n"
				+ "3.�ark�c� Ekle\n"
				+ "4.�ark�c� Sil\n"
				+ "5.�ark�c� G�ncelle\n"
				+ "6.�ark�c� Ara\n"
				+ "7.��kmak i�in q ya bas�n\n";
		
		System.out.println(islemler);
				
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
			
			islemleri_bastir();
			
			while(true)
			{
				System.out.println("��lem se�iniz..");
				String islem=scan.nextLine();
				
				if(islem.equals("q"))
				{
					System.out.println("��k�l�yor..");
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
					System.out.println("Eklemek istedi�iniz �ark�c�..");
					String eklenecek_sarkici=scan.nextLine();
					sarkici.sarkici_ekle(eklenecek_sarkici);
					System.out.println("�ark�c� eklendi....");
					System.out.println("_____________________________________");
				}
				else if(islem.equals("4"))
				{
					System.out.println("Silmek istedi�iniz �ark�c�..");
					String silinecek_sarkici=scan.nextLine();
					sarkici.sarkici_sil(silinecek_sarkici);
					System.out.println("_____________________________________");
				}
				else if(islem.equals("5"))
				{
					System.out.println("G�ncellemek istedi�iniz indexxx...");
					int sira=scan.nextInt();
					scan.nextLine();
					System.out.println("G�ncellemek istedi�iniz �ark�c� ismi");
					String yeni_sarkici=scan.nextLine();
					sarkici.sarkici_guncelle((sira-1), yeni_sarkici);
					System.out.println("�ark�c� g�ncellendi...");
					System.out.println("_____________________________________");
				}
				else if(islem.equals("6"))
				{
					System.out.println("Aramak istedi�iniz �ark�c�.."); 
					String sarkici_ismi=scan.nextLine();
					sarkici.sarkici_ara(sarkici_ismi);
					System.out.println("_____________________________________");
				}
				else
				{
					System.out.println("Hatal� i�lem yapt�n�z.Tekrar deneyin...");
				    System.out.println("_____________________________________");
				    islemleri_bastir();
				    
				}
			}
		
		
		
		
		/*
		sarkici.sarkici_ekle("Murat");
		sarkici.sarkici_ekle("Tarkan");
		sarkici.sarkici_ekle("Ahmet");
		
		
		
		
		sarkici.sarkicilari_goster();
		
		
		sarkici.sarkici_guncelle(0, "�lker");
		
		
		sarkici.sarkici_sil("Ahmet");
		
		sarkici.sarkici_ekle("Mustafa");
		
		sarkici.sarkici_ara("�lkegr");
		
		
		*/
		
		
		
	}
	
	
	
	
	

}
