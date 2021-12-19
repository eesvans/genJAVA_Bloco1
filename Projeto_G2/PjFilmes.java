package Projeto_G2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PjFilmes extends PjCinema {
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
		String[] titulosM18 = {"ToyStory 12", "Procurando Nemo de Novo", "Star Wars Ep X","Spiderman No Way Home","Deadpool 3"};
		String[] titulosM16 = {"ToyStory 12", "Procurando Nemo de Novo", "Star Wars Ep X","Spiderman No Way Home"};
		String[] titulosM12 = {"ToyStory 12", "Procurando Nemo de Novo"};
		if(super.getIdade() <= 12)
		{
			System.out.println("Filmes em cartaz indicados para idade até 12 anos.\n");
			System.out.println(Arrays.toString(titulosM12));
			System.out.println("---------------------------------------------------------------------");
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("Filmes em cartaz indicados para maiores de 12 anos.\n");
			System.out.println(Arrays.toString(titulosM16));
			System.out.println("---------------------------------------------------------------------");
		}
		else
		{
			System.out.println("Filmes em cartaz indicados para maiores de 18 anos.\n");
			System.out.println(Arrays.toString(titulosM18));
			System.out.println("---------------------------------------------------------------------");
		}
	}
	public void emBreve()
	{
		String[] titulosEM18 = {"Os Incríveis 3","20 Coisas que Odeios em Você","Sexta-feira 13 Parte 20"};
		String[] titulosEM16 = {"Os Incríveis 3","20 Coisas que Odeio em Você"};
		String[] titulosEM12 = {"Os Incríveis 3"};
		
		if(super.getIdade() <= 12)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para idade até 12 anos.\n");
			System.out.println(Arrays.toString(titulosEM12));
			System.out.println("---------------------------------------------------------------------");
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 12 anos.\n");
			System.out.println(Arrays.toString(titulosEM16));
			System.out.println("---------------------------------------------------------------------");
		}
		else
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 18 anos.\n");
			System.out.println(Arrays.toString(titulosEM18));
			System.out.println("---------------------------------------------------------------------");
		}
	}
	public void compraIngresso()
	{
		int op,iC,imP;
		String movie;
			
		Set<String> fileira1 = new TreeSet<String>();
		
		fileira1.add("1-A");
		fileira1.add("2-A");
		fileira1.add("3-A");
			
		Set<String> fileira2 = new TreeSet<String>();
		
		fileira2.add("1-B");
		fileira2.add("2-B");
		fileira2.add("3-B");
			
		Set<String> fileira3 = new TreeSet<String>();
		
		fileira3.add("1-C");
		fileira3.add("2-C");
		fileira3.add("3-C");
		
		do
		{
			
			String art = """                                                                                                                                                   
  ..|'''.| '||' '|.   '|' '||''''|      ..|'''.|  '||''''|  '|.   '|' 
.|'     '   ||   |'|   |   ||  .       .|'     '   ||  .     |'|   |  
||          ||   | '|. |   ||''|       ||    ....  ||''|     | '|. |  
'|.      .  ||   |   |||   ||          '|.    ||   ||        |   |||  
 ''|....'  .||. .|.   '|  .||.....|     ''|...'|  .||.....| .|.   '|  
                                                                      
                                                                      """;
			for(int i=0; i<art.length();i++)
			{
				System.out.print(art.charAt(i));
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\n(1) Mostrar filmes em cartaz.");
			System.out.println("\n(2) Verificar os assentos disponíveis.");
			System.out.println("\n(3) Comprar ingresso.");
			System.out.println("\n(4) Mostrar filmes que chegarão em breve.");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nSelecione uma opção!");
			System.out.println("---------------------------------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nInforme sua idade: ");
				iC=leia.nextInt();
				super.setIdade(iC);
				emCartaz();
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nAssentos disponíveis:");
				System.out.println("\n\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				System.out.println("\n");
				System.out.println("---------------------------------------------------------------------");
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme sua idade: ");
				iC=leia.nextInt();
				super.setIdade(iC);
				emCartaz();
				System.out.println("\nEscolha o filme: ");
				movie=leia.nextLine();
				movie+=leia.nextLine();
				System.out.println("\n\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				System.out.println("\nEscolha o assento desejado: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo status do assento "+verifica+": ");
				String novo = leia.nextLine();
				if(fileira1.contains(verifica))
				{
					fileira1.remove(verifica);
					fileira1.add(novo);
				}
				else if(fileira2.contains(verifica))
				{
					fileira2.remove(verifica);
					fileira2.add(novo);		
				}
				else if(fileira3.contains(verifica))
				{
					fileira3.remove(verifica);
					fileira3.add(novo);	
				}
				else
				{
					System.out.println("\nAssento não existe!!");
				}
				System.out.println("\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				System.out.println("\nDigite (1) para imprimir o ingresso.");
				imP=leia.nextInt();
				if(imP == 1)
				{
					System.out.println("\nIngresso Adquirido para o filme " +movie+ ". Poltrona: "+novo);
					System.out.println("---------------------------------------------------------------------");
				}
				else
				{
					System.out.println("\nComando inválido!!");
					System.out.println("---------------------------------------------------------------------");
				}
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
