/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */
package Arrays;

import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int x,somaP=0,contI=0,num;
		int[] a = new int [6];
		int[] p = new int [6];
				              
		
		
		for(x=0;x<6;x++)
		{
			System.out.printf("\nEntre com um número: ");
			num=leia.nextInt();
						
			a[x]=num;
			
			if(a[x]%2==0)
			{
				somaP+=a[x];
				
			}
			else
			{
				contI++;
				
			}
			
		}
		System.out.println("\nA somatória dos números pares é de "+somaP);
		System.out.println("\nA quantidade de números ímpares é de "+contI);
		
		System.out.println("\nOs números pares digitados foram: ");
		for(x=0;x<6;x++) 
		{ 
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}
			
		}
		System.out.println("\nOs númeors ímpares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(a[x]%2!=0)
			{
				System.out.println(a[x]);
			}
		}
	}

}
