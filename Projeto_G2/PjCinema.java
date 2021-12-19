package Projeto_G2;

import java.util.Scanner;

public abstract class PjCinema {
	Scanner leia = new Scanner(System.in);
	
	private int idade;
	private String ingresso;
	
	public PjCinema(int idade, String ingresso)
	{
		this.idade=idade;
		this.ingresso=ingresso;
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
	public String getIngresso() {
		return ingresso;
	}
	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	
}
