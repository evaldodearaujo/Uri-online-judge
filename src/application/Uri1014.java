package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double litros = sc.nextDouble();
		
		double valor = km / litros;
		
		System.out.printf("%.3f", valor, " km/l");
		
		
		sc.close();

	}

}
