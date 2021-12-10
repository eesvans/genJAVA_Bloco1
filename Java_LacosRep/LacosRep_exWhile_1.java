package Java_LacosRep;

import java.util.Scanner;

public class LacosRep_exWhile_1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int x,idade,totalPme21=0,totalPma50=0;
		
		System.out.println("\nInforme sua idade: ");
		idade=ler.nextInt();
				
		while(idade!=-99)
		{
			if(idade<21)
			{
				totalPme21++;
			}
			else if (idade>50)
			{
				totalPma50++;
			}
			else
			{
				System.out.println("Idade não computada!");
			}
			System.out.println("\nInforme sua idade: ");
			idade=ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de "+totalPme21);
		System.out.println("\nO total de pessoas com mais de 50 anos é de "+totalPma50);
		
	}
}
