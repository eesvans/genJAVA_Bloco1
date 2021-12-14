package POO_Lista1;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente (null,null,null,null,null,null);
		//cliente1.imprimirInfo();
		String n,s,e,t,i,d;
		//int t,i,d;
		
		System.out.println("\nEntre com o seu nome: ");
		n=leia.next();
		cliente1.setNome(n);
		System.out.println("\nEntre com seu sexo: ");
		s=leia.next();
		cliente1.setSexo(s);
		System.out.println("\nEntre com seu endereço: ");
		e=leia.next();
		cliente1.setEndereco(e);
		System.out.println("\nInforme seu telefone: ");
		t=leia.next();
		cliente1.setTel(t);
		System.out.println("\nInforme sua idade: ");
		i=leia.next();
		cliente1.setIdade(i);
		System.out.println("\nInforme o número do seu CPF: ");
		d=leia.next();
		cliente1.setDoc(d);
		System.out.println("\n\n");
		cliente1.imprimirInfo();
		
					
		
	}

}
