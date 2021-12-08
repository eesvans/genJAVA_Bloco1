package JAVA_Bloco1;

import java.util.Scanner;

public class IntroJAVA_exerc_1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 1 ano - 365 dias
		 1 mês - 30 dias
		 1 dia - 1 dia
		 */
		
		
		int anos,meses,dias,totalDias;
		
		System.out.println("\nEntre quantos anos viveu: ");
		anos=leia.nextInt();
		System.out.println("\nEntre quantos meses viveu: ");
		meses=leia.nextInt();
		System.out.println("\nEntre quantos dias viveu: ");
		dias=leia.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
		System.out.println("\nVocê viveu "+totalDias+" dia(s)");

	}

}
