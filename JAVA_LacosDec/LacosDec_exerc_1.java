package JAVA_LacosDec;

import java.util.Scanner;

public class LacosDec_exerc_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("O primeiro número digitado, "+n1+", é o maior!");
		} else if (n2 > n1 && n2 > n3){
			System.out.printf("O segundo número digitado, "+n2+", é o maior!");
		} else {
			System.out.printf("O terceiro número digitado, "+n3+", é o maior!");
		}
	}
}