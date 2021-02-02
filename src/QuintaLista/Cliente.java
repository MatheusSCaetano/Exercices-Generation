package QuintaLista;

public class Cliente {
	private String nome;
	private String cpf;
	private String sexo;
	private String email;
	private String telefone;
	private int total_comprado=0;
	
	public Cliente(String nome, String cpf, String sexo, String email, String telefone) {
		this.nome=nome;
		this.cpf=cpf;
		this.sexo=sexo;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void comprarProduto() {
		this.total_comprado++;
	}
	
	public void devolverProduto() {
		if(total_comprado>0) 
		this.total_comprado--;
	}
	
	public void printInfo() {
		System.out.println("***Informações do Cliente***\nNome:"+nome+"\nCPF: "+cpf+"\nSexo: "+sexo+"\nE-mail: "+email
				+"\nTelefone: "+telefone+"\nTotal de Produtos Comprados: "+total_comprado);
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
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getTotal_comprado() {
		return total_comprado;
	}

	public void setTotal_comprado(int total_comprado) {
		this.total_comprado = total_comprado;
	}
	
}
