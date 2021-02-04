package SextaLista;

import java.util.Scanner;

public class TestaVendedor {
public static void main(String[] args) {
	try(Scanner leia = new Scanner(System.in)){
		int escolha;
		do{
		
		System.out.println("***Bem-Vindo ao verificador de Comissões***");
		System.out.print("Digite o nome do vendedor: ");
		String nome = leia.nextLine();
		
		System.out.print("Digite o CPF do vendedor: ");
		String cpf = leia.nextLine();
		
		System.out.print("Digite a idade do vendedor: ");
		int idade = leia.nextInt();
		
		leia.nextLine();
		System.out.print("Digite o endereço do vendedor: ");
		String endereco = leia.nextLine();
		
		System.out.print("Digite o telefone de contato do vendedor: ");
		String telefone = leia.nextLine();
		
		System.out.print("Digite o valor de vendas realizado pelo vendedor: ");
		double valorVendas = leia.nextDouble();
		
		System.out.print("Digite a % de comissão do vendedor: ");
		double comissao = leia.nextDouble();
		
		System.out.print("Digite o salario do vendedor: ");
		double salario = leia.nextDouble();

		Vendedor vendedor = new Vendedor(nome, cpf, idade, endereco, telefone, valorVendas, comissao, salario);
		
		
		if(vendedor.validaCpf()) {
		System.out.print("STATUS: Vendedor c/ CPF válido");
		vendedor.printInfo();
		System.out.print("\n-----------------------------------------------");
		System.out.print("\nDeseja verificar Novamente a comissão de um vendedor?\n1-SIM\n2-NÃO\nDigite sua opção: ");
		escolha=leia.nextInt();
		}
		else {
		System.out.print("------------------------------------------------------------------------------------------");
		System.out.print("\nSTATUS:Vendedor c/ CPF inválido, por favor verifique a quantidade de caracteres do CPF");
		System.out.print("\n------------------------------------------------------------------------------------------");
		System.out.print("\nDeseja verificar Novamente a comissão de um vendedor?\n1-SIM\n2-NÃO\nDigite sua opção: ");
		escolha=leia.nextInt();
		}
		
		leia.nextLine();
		}while(escolha!=2);
		System.out.println("OBRIGADO POR UTILIZAR NOSSO VERIFICADOR");	
		
	}
}
}
