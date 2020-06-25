package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		double A = 0, B = 0, C = 0;
		
		if(num1 > num2 && num1 > num3)
		{
			A = num1;
			if(num2 > num3)
			{
				B = num2;
				C = num3;
			}
			else
			{
				B = num3;
				C = num2;
			}
			
		}	
		else if(num2 > num3)
		{
			A = num2;
			if(num1 > num3)
			{
				B = num1;
				C = num3;
			}
			else 
			{
				B = num3;
				C = num1;
			}
		
		}
		else
		{
			A = num3;
			if(num1 > num2)
			{
				B = num1;
				C = num2;
			}
			else
			{
				B = num2;
				C = num1;
			}
		}
		
		if(A >= B + C)
		{
			System.out.println("NAO FORMA TRINGULO");
		}
		else
		{
			if(A * A == B*B + C*C)
			{
				System.out.println("TRIANGULO RETANGULO");
			}
			else if(A * A > B*B + C*C)
			{
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else
			{
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A == B && B == C)
			{
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if(A == B || A == C || B == C)
			{
				System.out.println("TRIANGULO ISOSCELES");
			}
			
		}

			sc.close();
		
	}

}
