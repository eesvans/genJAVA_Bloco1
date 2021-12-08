package JAVA_Bloco1;

import java.util.Scanner;

public class IntroJAVA_exerc_2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 1 ano - 365 dias
		 1 mês - 30 dias
		 1 dia - 1 dia
		 */
		
		int anos,meses,totalDias,dias;
		
		System.out.println("\nInforme o total de dias você viveu: ");
		totalDias=leia.nextInt();
		
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = meses*30;
		
		System.out.println("\nVocê viveu "+anos+" ano(s), "+meses+" mês(es) e "+dias+" dia(s).");
	}
}
