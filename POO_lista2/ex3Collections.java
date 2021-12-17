package POO_lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
			
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("-------------------------------------------");
			System.out.println("\n\t\tMenu do meu Estoque");
			System.out.println("\n(1) Deseja armazenar um produto no estoque?");
			System.out.println("\n(2) Deseja remover um produto do estoque?");
			System.out.println("\n(3) Deseja atualizar um produto no estoque?");
			System.out.println("\n(4) Mostrar todos os produtos do estoque.");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nSelecione uma opção: ");
			System.out.println("-------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existente no estoque.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nMostrar os produtos do estoque");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa.");
				
			}
			
		}while(op!=0);

	}

}
