package SextaLista;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;
	private double salario;
	
	public Vendedor(String nome, String cpf, int idade, String endereco, String telefone, double valorVendas, double comissao, double salario) {
		super(nome, cpf, idade, endereco, telefone);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
		this.salario = salario;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVenda(double valorVendas) {
		this.valorVendas = valorVendas; 
	}
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao=comissao;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double valorComissao() {
		return (getComissao()/100)*getValorVendas();
	}
	public void printInfo() {
		System.out.println("\n***Informações Vendedor***\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()
				+"\nEndereço: "+getEndereco()
				+"\nTelefone: "+getTelefone()
				+"\nValor realizado de Vendas: R$ "+getValorVendas()
				+"\nComissão sobre o total realizado de Vendas: "+getComissao()+"%"
				+"\nSalario: "+getSalario()
				+"\nSalario FINAL: R$ "+(getSalario()+valorComissao())
				);
	}
}
