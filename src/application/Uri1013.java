package application;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int k = (num1 + num2 + Math.abs(num1 - num2)) / 2;
		int z = (k + num3 + Math.abs(k - num3)) / 2;
		
		System.out.println(z + " eh o maior");
		sc.close();
	}

}
