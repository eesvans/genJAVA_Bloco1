package POO_Lista1;

public class Cliente {
	
	private String nome;
	private String sexo;
	private String endereco;
	private int tel;
	private int idade;
	private String doc;
	
	public Cliente ()
	{
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO cliente "+nome+" (sexo  "+sexo+") residente no endereço: "+endereco+". Telefone de contato "+tel+", idade "+idade+" anos, dono do documento de nº "+doc);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

}
