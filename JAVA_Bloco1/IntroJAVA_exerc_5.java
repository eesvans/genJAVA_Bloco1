package JAVA_Bloco1;

import java.util.Scanner;

public class IntroJAVA_exerc_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float p1,p2,p3,n1,n2,n3,mediaPond;
		
		System.out.println("\nInformar o Peso da nota 1: ");
		p1=leia.nextFloat();
		System.out.println("\nInformar o Peso da nota 2: ");
		p2=leia.nextFloat();
		System.out.println("\nInformar o Peso da nota 3: ");
		p3=leia.nextFloat();
		System.out.println("\nInformar a nota 1: ");
		n1=leia.nextFloat();
		System.out.println("\nInformar a nota 2: ");
		n2=leia.nextFloat();
		System.out.println("\nInformar a nota 3: ");
		n3=leia.nextFloat();
		
		mediaPond=(p1*n1+p2*n2+p3*n3)/(p1+p2+p3);
	
		System.out.printf("\nSua nota média foi de: %.2f",mediaPond);

	}

}