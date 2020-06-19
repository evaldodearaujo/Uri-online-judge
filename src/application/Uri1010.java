package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double total = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
		sc.close();

	}

}
