package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double total = 0;
		
		switch(codigo)
		{
		case 1:
			total = 4.0 * qtd;
			break;
		case 2:
			total = 4.50 * qtd;
			break;
		case 3:
			total = 5.0 * qtd;
			break;
		case 4:
			total = 2.0 * qtd;
			break;
		case 5:
			total = 1.50 * qtd;
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
