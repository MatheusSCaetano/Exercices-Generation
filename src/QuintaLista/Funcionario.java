package QuintaLista;

import java.text.NumberFormat;

public class Funcionario {
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String email;
	private String data_nas;
	private String matricula;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cpf, String rg,String sexo, String email, String data_nas, String matricula,
			String cargo, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.email = email;
		this.data_nas = data_nas;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1+percentual/100;
	}
	
	public String formatarSal()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void printInfo() {
		System.out.println("*****Informações do Funcionário*****\nNome:"+nome+"\nCPF: "+cpf+"\nRG: "+rg+"\nSexo: "+sexo
		+"\nEmail: "+email+"\nData Nascimento: "+data_nas+"\nMatricula: "+matricula+"\nCargo: "+cargo+"\nSalario: "+this.formatarSal());
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	public String getData_nas() {
		return data_nas;
	}

	public void setData_nas(String data_nas) {
		this.data_nas = data_nas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
