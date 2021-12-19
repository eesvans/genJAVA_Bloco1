package Projeto_G2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PjFilmes2 extends PjCinema {
	Scanner leia = new Scanner(System.in);
	
	private String emCartaz;
	private String emBreve;
	
	
	
	public Scanner getLeia() {
		return leia;
	}
	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	public String getEmCartaz() {
		return emCartaz;
	}
	public void setEmCartaz(String emCartaz) {
		this.emCartaz = emCartaz;
	}
	public String getEmBreve() {
		return emBreve;
	}
	public void setEmBreve(String emBreve) {
		this.emBreve = emBreve;
	}
	public void emCartaz()
	{	
		String[] titulosM18 = {"Filmex", "Filmex2", "Filmex3","Filmex4","Filmex5","Filmex6","Filmex7"};
		String[] titulosM16 = {"Filmex", "Filmex2", "Filmex3","Filmex4","Filmex5"};
		String[] titulosM12 = {"Filmex", "Filmex2", "Filmex3"};
		if(super.getIdade() <= 12)
		{
			System.out.println("Filmes em cartaz indicados para idade até 12 anos.");
			System.out.println(Arrays.toString(titulosM12));
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("Filmes em cartaz indicados para maiores de 12 anos.");
			System.out.println(Arrays.toString(titulosM16));
		}
		else
		{
			System.out.println("Filmes em cartaz indicados para maiores de 18 anos.");
			System.out.println(Arrays.toString(titulosM18));
		}
	}
	public void emBreve()
	{
		String[] titulosEM18 = {"FilmexE","Filmex2E","Filmex3E","Filmex4E","Filmex5E","Filmex6E","Filmex7E"};
		String[] titulosEM16 = {"FilmexE","Filmex2E","Filmex3E","Filmex4E","Filmex5E"};
		String[] titulosEM12 = {"FilmexE","Filmex2E","Filmex3E"};
		
		if(super.getIdade() <= 12)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para idade até 12 anos.");
			System.out.println(Arrays.toString(titulosEM12));
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 12 anos.");
			System.out.println(Arrays.toString(titulosEM16));
		}
		else
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 18 anos");
			System.out.println(Arrays.toString(titulosEM18));
		}
	}
	
	public void compraIngresso2()
	{
		int op,iC;
			
		Set<String> fileira1 = new HashSet<String>();
		
		fileira1.add("A-1");
		fileira1.add("A-2");
		fileira1.add("A-3");
		
		Iterator <String> ifileira1 = fileira1.iterator();

		while(ifileira1.hasNext())
		{
			System.out.println(ifileira1.next());
		}
		
		Set<String> fileira2 = new HashSet<String>();
		
		fileira2.add("B-1");
		fileira2.add("B-2");
		fileira2.add("B-3");
		
		Iterator <String> ifileira2 = fileira2.iterator();

		while(ifileira2.hasNext())
		{
			System.out.println(ifileira2.next());
		}
		
		Set<String> fileira3 = new HashSet<String>();
		
		fileira3.add("C-1");
		fileira3.add("C-2");
		fileira3.add("C-3");
		
		Iterator <String> ifileira3 = fileira3.iterator();

		while(ifileira3.hasNext())
		{
			System.out.println(ifileira3.next());
		}
		
		do
		{
			System.out.println("-------------------------------------------");
			System.out.println("\n\t\tCINEMINHA FELAS");
			System.out.println("\n(1) Mostrar verificar os assentos disponíveis.");
			System.out.println("\n(2) Atualizar assentos.");
			System.out.println("\n(3) Mostrar filmes em cartaz");
			System.out.println("\n(4) Mostrar filmes que chegarão em breve.");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nSelecione uma opção!");
			System.out.println("-------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nAssentos disponíveis");
				System.out.println("--------------TELA--------------");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o assento comprado: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo status do assento "+verifica+": ");
				String novo = leia.nextLine();
				if(fileira1.contains(verifica))
				{
					fileira1.remove(verifica);
					fileira1.add(novo);
					
					while(ifileira1.hasNext())
					{
						System.out.println(ifileira3.next());
					}
				}
				else if(fileira2.contains(verifica))
				{
					fileira2.remove(verifica);
					fileira2.add(novo);
					
					while(ifileira1.hasNext())
					{
						System.out.println(ifileira3.next());
					}
					
				}
				else if(fileira3.contains(verifica))
				{
					fileira3.remove(verifica);
					fileira3.add(novo);
					
					while(ifileira1.hasNext())
					{
						System.out.println(ifileira3.next());
					}
				
				}
				else
				{
					System.out.println("\nAssento não existe!!");
				}
				System.out.println("--------------TELA--------------");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				
				break;
				
			case 3:
				System.out.println("\nInforme sua idade: ");
				iC=leia.nextInt();
				super.setIdade(iC);
				emCartaz();
				break;
				
			case 4:
				System.out.println("\nInforme sua idade: ");
				iC=leia.nextInt();
				super.setIdade(iC);
				emBreve();
				break;
			default:
				System.out.println("\nFinalizou o programa.");
				
			}
			
		}while(op!=0);
	}
	

}
