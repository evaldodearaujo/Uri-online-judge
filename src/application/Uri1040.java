package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040
{

	public static void main(String[] args)
	{

		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float notaExame;
		float mediaExame;
		
		float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);
		
		if (media >= 7.0)
		{
			System.out.printf("Media: %.1f%n", media);
			System.out.printf("Aluno aprovado.%n");
		}
		else if (media < 5.0)
		{
			System.out.printf("Media: %.1f%n", media);
			System.out.printf("Aluno reprovado.%n");
		}
		else if (media <= 6.9)
		{
			System.out.printf("Media: %.1f%n", media);
			System.out.printf("Aluno em exame.%n");
			
			notaExame = sc.nextFloat();
			
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			
			mediaExame = (media + notaExame) / 2;
			
			if (mediaExame >= 5.0)
			{
				System.out.printf("Aluno aprovado.%n");
				System.out.printf("Media final: %.1f%n", mediaExame);
			}
			else
			{
				System.out.printf("Aluno reprovado.%n");
				System.out.printf("Media final: %.1f%n", mediaExame);
			}
												
		}
				
		sc.close();
	}
}
