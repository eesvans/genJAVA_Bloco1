package POO_Lista1;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente ();
		//cliente1.imprimirInfo();
		String n,s,e,d;
		int t,i;
		
		System.out.println("\nEntre com o seu nome: ");
		n=leia.nextLine();
		cliente1.setNome(n);
		System.out.println("\nEntre com seu sexo: ");
		s=leia.nextLine();
		cliente1.setSexo(s);
		System.out.println("\nEntre com seu endereço: ");
		e=leia.nextLine();
		cliente1.setEndereco(e);
		System.out.println("\nInforme seu telefone: ");
		t=leia.nextInt();
		cliente1.setTel(t);
		System.out.println("\nInforme sua idade: ");
		i=leia.nextInt();
		cliente1.setIdade(i);
		System.out.println("\nInforme o número do seu CPF: ");
		d=leia.next();
		cliente1.setDoc(d);
		System.out.println("\n\n");
		cliente1.imprimirInfo();
		
					
		
	}

}
