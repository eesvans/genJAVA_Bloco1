package Java_LacosRep;

import java.util.Scanner;

public class LacosRep_exDoWhile_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		int num,cont=0,somaNum=0;
		float media;
		
		System.out.println("\nInforme um número ");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0) 
			{
			cont++;
			somaNum+=num;
			}
			System.out.println("\nInforme um número ");
			num=leia.nextInt();
			
		}while(num!=0);
		
		media=somaNum/cont;
		System.out.printf("\nA soma dos números múltiplos de 3 é "+somaNum+" e sua média é %.2f",media);
	}
}
