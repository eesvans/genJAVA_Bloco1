package JAVA_LacosDec;

import java.util.Scanner;

public class LacosDec_exerc_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double numQuad;
		
		System.out.print("Entre com um n�mero: ");
		num = leia.nextInt();
		
		numQuad = Math.pow(num, 2);
		
		if((num%2==0)) {
			System.out.printf("O n�mero "+num+" � par e sua ra�z quadrada � %.2f",Math.sqrt(num));
		} else {
			System.out.println("O n�mero "+num+" � �mpar e elevado ao quadrado � "+numQuad);
		}
	}
}