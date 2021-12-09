package JAVA_LacosDec;

import java.util.Scanner;

public class LacosDec_exerc_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade < 15 ) {
			System.out.printf("A sua categoria é a infantil!");
		}else if(idade >= 15 && idade < 18) {
			System.out.printf("A sua categoria é a juvenil!");
		} else if(idade >= 18 && idade <= 25) {
			System.out.printf("A sua categoria é a adulto!");
		} else {
			System.out.printf("Você não está apto para participar de nenhuma categoria!");
		}
	}
}