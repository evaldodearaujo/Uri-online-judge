package application;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ano, mes, dia, resto;
		
		ano = n / 365;
		resto = n % 365;
		
		mes = resto / 30;
		dia = resto % 30;
		
		System.out.println(ano + " ano (s)");
		System.out.println(mes + " mes (es)");
		System.out.println(dia + " dia (s)");
		
		
		sc.close();

	}

}
