/*
 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

 */
package Arrays;

import java.util.Scanner;

public class Array_ex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float[][] m1 = new float [2][2]; 
		float[][] m2 = new float [2][2];
		float[][] m3 = new float [2][2];
		int linha,coluna,op;
		float num;
				
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Informe os números da primeira matriz: ");
				m1[linha][coluna]=leia.nextFloat();
								
			}
		}
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Informe os números da segunda matriz: ");
				m2[linha][coluna]=leia.nextFloat();
			}
		}
			
		System.out.println("\nAgora que informou os valores, escolha uma das opções abaixo: ");
		System.out.println("\n1 - Somar as duas matrizes.");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
		System.out.println("\n4 - Imprimir as matrizes.");
		op=leia.nextInt();
		
		switch(op)
		{
			case 1:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						m3[linha][coluna]=m1[linha][coluna]+m2[linha][coluna];
						
					}
				}
				System.out.println("\nA soma das duas matrizes é de: ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m3[linha][coluna]);
					}
				}
				break;
				
			case 2:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						m3[linha][coluna]=m1[linha][coluna]-m2[linha][coluna];
						
					}
				}
				System.out.println("\nA subtração da primeira matriz para a segunda é de: ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m3[linha][coluna]);
					}
				}
				break;
			case 3:
				
				System.out.println("\nInforme uma constante a adicionar na primeira e segunda matriz: ");
				num=leia.nextFloat();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						m1[linha][coluna]+=num;
						m2[linha][coluna]+=num;
												
					}
				}
				
								
				System.out.println("\nNovos valores MATRIZ 1");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m1[linha][coluna]);
					}
				}
				System.out.println("\nNovos valores MATRIZ 2");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m2[linha][coluna]);
					}
				}
				
				break;
				
			case 4:
				System.out.println("\nMATRIZ 1 ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m1[linha][coluna]);
					}
				}
				System.out.println("\nMATRIZ 2 ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+m2[linha][coluna]);
					}
				}
				break;
				
		}
		
			
	}

}
