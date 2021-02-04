package SextaLista;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	private String cnpj;
	private double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor(String nome, String endereco, String telefone, String cnpj, double valorCredito, double valorDivida ) {
		super(nome, endereco, telefone);
		this.cnpj=cnpj;
		this.valorCredito= valorCredito;
		this.valorDivida=valorDivida;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public String obterSaldo() {
		
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String saldo = nf.format(getValorCredito()-getValorDivida());
			return saldo;
		
	}
	public boolean validaCnpj() {
	 if(getCnpj().length()>14 || getCnpj().length()<14)	{
		 return false;
	 }
	 else {
		 return true;
	 }
	}
	public void printInfo() {
		System.out.println("----Informações do Fornedor----\nNome: "+getNome()
		                   +"\nCNPJ: "+getCnpj()
		                   +"\nEndeço: "+getEndereco()
		                   +"\nTelefone: "+getTelefone());
	}
}
