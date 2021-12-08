package JAVA_Bloco1;

import java.util.Scanner;

public class IntroJAVA_exerc_6 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2,dx,dy,dxy,distPontos;
		
		System.out.println("\nInforme o valor de x1: ");
		x1=leia.nextFloat();
		System.out.println("\nInforme o valor de y1: ");
		y1=leia.nextFloat();
		System.out.println("\nInforme o valor de x2: ");
		x2=leia.nextFloat();
		System.out.println("\nInforme o valor de y2: ");
		y2=leia.nextFloat();
		
		dx=Math.pow((x2-x1), 2);
		dy=Math.pow((y2-y1), 2);
		dxy=dx+dy;
		distPontos=Math.sqrt(dxy);
		
		System.out.printf("\nA distância entre os pontos no plano é de %.2f",distPontos);
		 
		
		
	}

}
