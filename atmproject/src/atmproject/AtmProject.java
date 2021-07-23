package atmproject;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		int bakiye = 1000, input, miktar;
		Scanner scan =new Scanner (System.in);
		
		System.out.println(" Merhaba ; Online islemler'e hosgeldiniz");
		System.out.println("Güncel bakiyeniz ; " + bakiye + "TL");
		
		while (bakiye > 0)
		{
			System.out.println(" ");
			System.out.println(" 1 -)  Para Yatır ");
			System.out.println(" 2 -)  Para Çek ");
			System.out.println(" 3 -)  Bakiye sorgula ");
			System.out.println(" 4 -)  Çıkıs Yap ");
			
			System.out.println("Yapmak istediginiz islemleri seciniz :  ");
			input =scan.nextInt();
			
			if(input ==1) 
				{
				System.out.println("Yatırmak istediginiz miktar");
				miktar = scan.nextInt();
				bakiye += miktar;
								
		      	}
			else if (input ==2)
				{
				System.out.println("Çekmek istediginiz miktar");
				miktar = scan.nextInt();
				
			
			if (miktar > bakiye )
			{
				System.out.println("Yetersiz bakiye !!");
			} else
			        {
				     bakiye -= miktar ;
			         }}

			else if (input ==3)
						{
				System.out.println("Güncel bakiyeniz : " + bakiye);
				
		             	}
			else if (input ==4)
			{
				System.out.println("Çıkıs yapılıyor !!");
						break;
			}
		
		}
		}
	}
		

	


