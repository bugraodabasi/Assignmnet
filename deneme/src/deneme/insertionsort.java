package deneme;

public class insertionsort {

	public static void main(String[] args) {
		int [] dizi= {50,30,10,40,80};
		int n=dizi.length;
		
		System.out.println("Sorttan önce");
		for(int a=0;a<dizi.length;a++)
		{
			System.out.println(dizi[a]);
		}
		
		
		
		for(int j=1;j<n;j++)
		{
			int key=dizi[j];
			int i=j-1;
			
			while((i>-1) && (dizi[i]>key))
			{
				dizi[i+1]=dizi[i];
				i--;
			}
			dizi[i+1]=key;
		}
		System.out.println("Sorttan sonra");
		for(int a=0;a<dizi.length;a++)
		{
			System.out.println(dizi[a]);
		}
	}

}
