package POO_Lista1;

public class Cliente {
	
	private String nome;
	private String sexo;
	private String endereco;
	private String tel;
	private String idade;
	private String doc;
	
	public Cliente (String nome, String sexo, String endereco, String tel, String idade, String doc)
	{
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.tel = tel;
		this.idade = idade;
		this.doc = doc;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

}
