package Projeto_G2;

import java.util.Scanner;

public abstract class PjCinema {
	Scanner leia = new Scanner(System.in);
	
	private int idade;
	
	public PjCinema(int idade)
	{
		this.idade=idade;
	}
	
	public PjCinema()
	{
		
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
