package application;

import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cedula = sc.nextInt();
		int divisao, resto, nota;
		
		System.out.println(cedula);
		
		resto = cedula;
		
		nota = 100;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 10;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 2;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 1;
		divisao = resto / nota;
		System.out.println(divisao + " nota(s) de R$ " + nota + ",00");
		
		
		sc.close();

	}

}
