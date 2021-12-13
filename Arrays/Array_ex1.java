/*
 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */

package Arrays;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int soma015;
		int[] a = new int [6];
		
		a[0]=1; a[1]=0; a[2]=5; a[3]=-2; a[4]=-5; a[5]=7;
		
		soma015=a[0]+a[1]+a[5];
		
		System.out.printf("\nA soma das posições A[0], A[1] e A[5] é de %d",soma015);
		
		a[3]=100;
		
		System.out.printf("\nPosição 1 do vetor A é de %d",a[0]);
		System.out.printf("\nPosição 2 do vetor A é de %d",a[1]);
		System.out.printf("\nPosição 3 do vetor A é de %d",a[2]);
		System.out.printf("\nPosição 4 do vetor A é de %d",a[3]);
		System.out.printf("\nPosição 5 do vetor A é de %d",a[4]);
		System.out.printf("\nPosição 6 do vetor A é de %d",a[5]);
		
		
	}

}
