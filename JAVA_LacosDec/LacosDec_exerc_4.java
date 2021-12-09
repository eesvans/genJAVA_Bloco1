package JAVA_LacosDec;

import java.util.Scanner;

public class LacosDec_exerc_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double numQuad;
		
		System.out.print("Entre com um número: ");
		num = leia.nextInt();
		
		numQuad = Math.pow(num, 2);
		
		if((num%2==0)) {
			System.out.printf("O número "+num+" é par e sua raíz quadrada é %.2f",Math.sqrt(num));
		} else {
			System.out.println("O número "+num+" é ímpar e elevado ao quadrado é "+numQuad);
		}
	}
}