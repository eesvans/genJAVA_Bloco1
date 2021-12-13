/*
 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package Arrays;

import java.util.Scanner;

public class Array_ex3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int[][] num = new int[3][3];
		int linha,coluna,cont=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número ");
				num[linha][coluna]=leia.nextInt();
				
				if(num[linha][coluna]>10)
				{
					cont++;
				}
				
			}
		}
		System.out.printf("\nForam informados %d números maiores que 10 para matriz.",cont);
	}

}
