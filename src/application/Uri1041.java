package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args)
	{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if (num1 == 0 && num2 == 0)
		{
			System.out.println("Origem");
		}
		else if (num1 == 0)
		{
			System.out.println("Eixo Y");
		}
		
		else if (num2 == 0)
		{
			System.out.println("Eixo X");
		}
		else if (num1 > 0 && num2 > 0)
		{
			System.out.println("Q1");
		}
		else if (num1 < 0 && num2 > 0)
		{
			System.out.println("Q2");
		}
		else if (num1 < 0 && num2 < 0)
		{
			System.out.println("Q3");
		}
		else
		{
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
