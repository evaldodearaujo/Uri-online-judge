package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoViagem = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double qtdLitros = (double) tempoViagem * velocidadeMedia / 12.0;
		
		System.out.printf("%.3f%n", qtdLitros);
		
		sc.close();

	}

}
