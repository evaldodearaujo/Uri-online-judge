package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cedula = sc.nextDouble();
		int divisao, resto, nota, moeda;
		
		resto = (int) (cedula * 100.0 + 0.5);
		
		System.out.println("NOTAS:");
		nota = 100;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 50;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 20;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 10;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 5;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 2;
		divisao = resto / (nota * 100);
		System.out.println(divisao + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		System.out.println("MOEDAS:");
		moeda = 100;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		moeda = 50;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 0.50");
		resto = resto % moeda;
		
		moeda = 25;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		moeda = 10;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		moeda = 5;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		moeda = 1;
		divisao = resto / moeda;
		System.out.println(divisao + " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
