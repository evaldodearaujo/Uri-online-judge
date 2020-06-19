package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double total = (totalVendas * 0.15) + salario;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}
