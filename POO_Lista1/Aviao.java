package POO_Lista1;

public class Aviao {
		
	private String modelo;
	private String cor;
	private String companhia;
	private int ano;

	public Aviao (String modelo, String cor, String companhia, int ano)
	{
		this.modelo = modelo;
		this.cor=cor;
		this.companhia=companhia;
		this.ano=ano;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Avião modelo "+modelo+", cor "+cor+", de posse da companhia "+companhia+". Fabricado no ano de "+ano+".");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
