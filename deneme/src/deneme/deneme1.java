package deneme;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;


public class deneme1 {

	public static void main(String[] args) throws IOException {
		ArrayList<String>ogrenciler= new ArrayList<>();
		ArrayList<String>notlar= new ArrayList<>();
		ogrenciler.add("B1705.090025");
		ogrenciler.add("Hasan Buðra");
		ogrenciler.add("ODABAÞI");
		ogrenciler.add("10");
		ogrenciler.add("10");
		ogrenciler.add("102");
		ogrenciler.add("100");
		ogrenciler.add("10");
		ogrenciler.add("B1705.090012");
		ogrenciler.add("Berkay");
		ogrenciler.add("DURSUN");	
		ogrenciler.add("10");
		ogrenciler.add("10");
		ogrenciler.add("10");
		ogrenciler.add("105");
		ogrenciler.add("10");
		ogrenciler.add("B1705.090054");
		ogrenciler.add("Özer");
		ogrenciler.add("DEMÝR");
		ogrenciler.add("10");
		ogrenciler.add("120");
		ogrenciler.add("10");
		ogrenciler.add("10");
		ogrenciler.add("10");
		File file=new File("C:\\Users\\user\\Desktop\\Ogrenci.txt");
		FileWriter ogrnc=new FileWriter(file);
		if(!file.exists())
		{
			file.createNewFile();
			
			
		}
		int sayac=0;
		for(int i=0;i<ogrenciler.size();i++) {
			sayac++;
			ogrnc.write(ogrenciler.get(i)+"\n");
			
		}

		ogrnc.close();
		
		Scanner secim=new Scanner(System.in);
		int secim1;
		do
		{
			System.out.println("1-Öðrencileri Listele");
			System.out.println("2-Öðrenci Listele");
			System.out.println("3-Güncelleme");
			System.out.println("4-Öðrenci Silme");
			System.out.println("5-Öðrenci GPA");
			System.out.println("6-Tüm Öðrencilerin GPA'si");
			System.out.println("7-Sort");
			System.out.println("8-Binary Search");
			System.out.println("0-Çýkýþ");
			 secim1=secim.nextInt();
			switch(secim1)
			{
			
			case 1:
				Scanner sinif=new Scanner(file);
				while(sinif.hasNext())
				{
					String bilgi=sinif.nextLine();
					System.out.println(bilgi);
				}
				break;
			case 2:
				System.out.println("Numara Girin:");
				Scanner ogrenci_id=new Scanner(System.in);
				String ogr_id=ogrenci_id.nextLine();
				
				Scanner ogrencii=new Scanner(file);
				while(ogrencii.hasNext())
				{
					String bilgi1=ogrencii.nextLine();
					if(ogr_id.equals(bilgi1))
					{
						int i;
						System.out.println(bilgi1);
						for(i=1;i<8;i++)
						{
							bilgi1=ogrencii.nextLine();
							System.out.println(bilgi1);
						}
					}
					
				}
				break;
				
			case 3:
				System.out.println("Numara Girin:");
				Scanner ogrenci_id2=new Scanner(System.in);
				String ogr_id2=ogrenci_id2.nextLine();
				
				FileWriter yaz=new FileWriter(file);
		
				int i;
				for(i=0;i<ogrenciler.size();i++)
				{
					if(ogr_id2.equals(ogrenciler.get(i)))
					{
						System.out.println("1-NUM\n2-AD\n3-SOYAD\n4-DERS1\n5-DERS2\n6-DERS3\n7-DERS4\n8-DERS5\nGüncellemek Ýstediðiniz bilgiyi girin:");
						Scanner ogrenci3=new Scanner(System.in);
						int ogr3=ogrenci3.nextInt();
						
						System.out.println("Yeni deðeri Girin:");
						Scanner yeni_deger=new Scanner(System.in);
						String yeni_ogr=yeni_deger.nextLine();
						
						if(ogr3==1)//id için
						{
			
							ogrenciler.set(i, yeni_ogr);
							
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==2)//id için
						{
		
							ogrenciler.set(i+1, yeni_ogr);
				
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==3)//id için
						{
				
							ogrenciler.set(i+2, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==4)//id için
						{

							ogrenciler.set(i+3, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==5)//id için
						{
							
							ogrenciler.set(i+4, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==6)//id için
						{
							
							ogrenciler.set(i+5, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==7)//id için
						{
							
							ogrenciler.set(i+6, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write(ogrenciler.get(x)+"\n");
							}
						}
						else if(ogr3==8)//id için
						{
							
							ogrenciler.set(i+7, yeni_ogr);
			
							
							int x;
							for(x=0;x<ogrenciler.size();x++)
							{
								yaz.write("\n" +ogrenciler.get(x));
							}
						}
					}
				}
				yaz.close();
				break;
				
			case 4:
				System.out.println("Numara Girin:");
				Scanner ogrenci_id4=new Scanner(System.in);
				String ogr_id4=ogrenci_id4.nextLine();
				
				FileWriter yaz2=new FileWriter(file);
				
				int z;
				for(z=0;z<ogrenciler.size();z++)
				{
					if(ogr_id4.equals(ogrenciler.get(z)))
					{
						int y;
						for(y=z;y<z+8;y++)
						{
							ogrenciler.set(y, " ");
						}
						
					}
					yaz2.write(ogrenciler.get(z)+"\n");
				}
				yaz2.close();
				break;
				
			case 5:
					Gpa gpa=new Gpa();
					int r,s=0;
					int x;
					double sum=0;
					Scanner no=new Scanner(System.in);
					String no1=no.nextLine();
					Scanner not_cekme=new Scanner(file);
							int q=0;
						for(int i1=0;i1<ogrenciler.size();i1+=8) 
							{
								if(no1.equals(ogrenciler.get(i1)))
								{
								          notlar.add(ogrenciler.get(i1+3));
								          notlar.add(ogrenciler.get(i1+4));
								          notlar.add(ogrenciler.get(i1+5));
								          notlar.add(ogrenciler.get(i1+6));
								          notlar.add(ogrenciler.get(i1+7));
								}
									for(r=0;r<notlar.size();r+=5)  //   10 10 10 10 10
									{	
										
												gpa.setDers1(Double.parseDouble(notlar.get(r)));
												gpa.setDers2(Double.parseDouble(notlar.get(r+1)));
												gpa.setDers3(Double.parseDouble(notlar.get(r+2)));
												gpa.setDers4(Double.parseDouble(notlar.get(r+3)));
												gpa.setDers5(Double.parseDouble(notlar.get(r+4)));
											    gpa.hesOrt();
											    sum=gpa.getOrt();
										
										
									}
									notlar.clear();
								}
						
						System.out.println(sum);
						
						
				
				break;
				case 6:
							double sum1=0;
							for(int i1=0;i1<ogrenciler.size();i1+=8) 
							{
								  notlar.add(ogrenciler.get(i1+3));
						          notlar.add(ogrenciler.get(i1+4));
						          notlar.add(ogrenciler.get(i1+5));
						          notlar.add(ogrenciler.get(i1+6));
						          notlar.add(ogrenciler.get(i1+7));
						          
							}
							for(int i2=0;i2<notlar.size();i2++) 
							{
								sum1+=Double.valueOf(notlar.get(i2));
							}
					System.out.println(sum1/5);
			 break;
				case 7:
					ArrayList< String> liste=new ArrayList<String>();
					double sum2=0;
				for(int i1=0;i1<ogrenciler.size();i1+=8) 
				{
					  int ders1=Integer.valueOf(ogrenciler.get(i1+3));
					  int ders2=Integer.valueOf(ogrenciler.get(i1+4));
					  int ders3=Integer.valueOf(ogrenciler.get(i1+5));
					  int ders4=Integer.valueOf(ogrenciler.get(i1+6));
					  int ders5=Integer.valueOf(ogrenciler.get(i1+7));
					  int sonuc=(ders1+ders2+ders3+ders4+ders5)/5;
			          liste.add(String.valueOf(sonuc));
				}
				
				int n=liste.size();
				int t=0;	
				System.out.println("Buble Sort \nSorttan önce dizi");

				System.out.println(liste);
				timer.start();
				for(int i4=0;i4<liste.size();i4++)
				{
					for(int j=1;j<n;j++)
					{
						if(Integer.valueOf(liste.get(j-1))>Integer.valueOf(liste.get(j)))
						{
							t=Integer.valueOf(liste.get(j-1));
							liste.set(j-1, liste.get(j));
							liste.set(j, String.valueOf(t));
						}
					}
				}
				timer.stop();
				
				System.out.println("Sorttan sonra dizi");
				System.out.println(liste);
				System.out.println(timer.getElapsedMilliseconds());
				
				
				//ikincci sort

				liste.clear();
				for(int i1=0;i1<ogrenciler.size();i1+=8) 
				{
					  int ders1=Integer.valueOf(ogrenciler.get(i1+3));
					  int ders2=Integer.valueOf(ogrenciler.get(i1+4));
					  int ders3=Integer.valueOf(ogrenciler.get(i1+5));
					  int ders4=Integer.valueOf(ogrenciler.get(i1+6));
					  int ders5=Integer.valueOf(ogrenciler.get(i1+7));
					  int sonuc=(ders1+ders2+ders3+ders4+ders5)/5;
			          liste.add(String.valueOf(sonuc));
				}
				
				System.out.println("Ýnsertion Sort \nSorttan önce");
				System.out.println(liste);
				timer.start();
				for(int j2=1;j2<liste.size();j2++)
				{
					int key=Integer.valueOf(liste.get(j2));
					int i5=j2-1;
					
					while((i5>-1) && (Integer.valueOf(liste.get(i5))>key))
					{
						liste.set(i5+1,liste.get(i5));
						i5--;
					}
					liste.set(i5+1, String.valueOf(key));
				}
				timer.stop();

				System.out.println("Sorttan sonra");
				
					System.out.println(liste);
					System.out.println(timer.getElapsedMilliseconds());
				
	
				
					break;
				case 8:
					ArrayList< String> liste2=new ArrayList<String>();
				for(int i1=0;i1<ogrenciler.size();i1+=8) 
				{
					  int ders1=Integer.valueOf(ogrenciler.get(i1+3));
					  int ders2=Integer.valueOf(ogrenciler.get(i1+4));
					  int ders3=Integer.valueOf(ogrenciler.get(i1+5));
					  int ders4=Integer.valueOf(ogrenciler.get(i1+6));
					  int ders5=Integer.valueOf(ogrenciler.get(i1+7));
					  int sonuc=(ders1+ders2+ders3+ders4+ders5)/5;
			          liste2.add(String.valueOf(sonuc));
				}
				Scanner al=new Scanner(System.in);
				for(int i4=0;i4<liste2.size();i4++)
				{
					for(int j=1;j<liste2.size();j++)
					{
						if(Integer.valueOf(liste2.get(j-1))>Integer.valueOf(liste2.get(j)))
						{
							t=Integer.valueOf(liste2.get(j-1));
							liste2.set(j-1, liste2.get(j));
							liste2.set(j, String.valueOf(t));
						}
					}
				}
			      System.out.println(liste2);  
			      System.out.println("Arananý giriniz");  
				int key=al.nextInt();
				
					int first=0;
					int last=liste2.size();
					int mid = liste2.size()/2;  
					timer.start();
					   while( 0 <= liste2.size() ){  
					      if ( Integer.valueOf(liste2.get(mid))< key ){  
					        first = mid + 1;     
					      }else if ( Integer.valueOf(liste2.get(mid)) == key ){  
					        System.out.println("Bulundu" + key);  
					        break;  
					      }else{  
					         last = mid - 1;  
					      }  
					      mid = (first + last)/2;  
					   }  
						timer.stop();
				        System.out.println(timer.getElapsedMilliseconds());  
					   if ( first > last ){  
					      System.out.println("Bulunamadý");  
					   }  
					break;
			}
		}while(secim1!=0);
		
	}
}
		
		
		
		
		
		
	

		
	


