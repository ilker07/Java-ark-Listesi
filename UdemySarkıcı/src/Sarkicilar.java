import java.util.ArrayList;

public class Sarkicilar {
	
	ArrayList<String> sarkici_listesi=new ArrayList<String>();
	public static boolean var;
	
	public void sarkicilari_goster()
	{
		if(sarkici_listesi.size()==0)
		{
			System.out.println("�ark�c� yok...");
		}
		
		else
		{
		int i=0;
		for(String isim:sarkici_listesi)
		{
			System.out.println((i+1)+".�ark�c� "+sarkici_listesi.get(i));
			i++;
		}
		
	}
	}
	
	
	public void sarkici_ekle(String sarkici_ismi)
	{
		
		sarkici_listesi.add(sarkici_ismi);
	}
	
	
	
	public  void sarkici_guncelle(int index,String yeni_sarkici)
	{
		System.out.println("�ark�c� g�ncellemesi....");
		sarkici_listesi.set(index, yeni_sarkici);
		sarkicilari_goster();
	}
	
	public void sarkici_sil(String sarkici_ismi)
	{  
		sarkici_ara(sarkici_ismi);
		
		if(var)
		{
			System.out.println("�ark�c� siliniyor...");
			sarkici_listesi.remove(sarkici_ismi);
			sarkicilari_goster();
		}
		
		
	}
	
	
	public  void sarkici_ara(String sarkici_ismi)
	{
		
	  	
	  int pozisyon=sarkici_listesi.indexOf(sarkici_ismi);
	  
	  if(pozisyon>=0)
	  {
		  System.out.println("�ark�c� bulunduu....");
		  System.out.println(sarkici_ismi+" "+ (pozisyon+1)+".s�rada bulundu...");
		  var=true;
		
	  }
	  else
	  {
		  System.out.println("B�yle bir �ark�c� bulunmamaktad�r...");
	      var=false;
	  }
		
		
	}

}
