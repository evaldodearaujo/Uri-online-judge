package application;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int horas, segundos, minutos, resto;
		
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		
		sc.close();

	}

}
