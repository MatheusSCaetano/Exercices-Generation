package SextaLista;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String cpf, int idade, String endereco, String telefone) {
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean validaCpf() {
		if(getCpf().length()<11 || getCpf().length()>11) {
			return false;
		}
		else {
			return true;
		}
	}
	public void validaMaioridade() {
		if(idade>=18) {
			System.out.println("Acesso Liberado");
		}
		else {
			System.out.println("Acesso Negado - Liberado apenas para maiores de 18 anos");
		}
	}
}
