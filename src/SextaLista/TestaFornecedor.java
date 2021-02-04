package SextaLista;
import java.util.Scanner;
public class TestaFornecedor {
	public static void main(String[] args) {
		try(Scanner leia = new Scanner(System.in)){
			int escolha;
			do{
			
			System.out.println("***Bem-Vindo ao verifica Saldo***");
			System.out.print("Digite o nome do Fornecedor: ");
			String nome = leia.nextLine();
			
			System.out.print("Digite o CPNJ do Fornecedor: ");
			String cnpj = leia.nextLine();
			
			System.out.print("Digite o endereço do Fornecedor: ");
			String endereco = leia.nextLine();
			
			System.out.print("Digite o telefone de contato do Fornecedor: ");
			String telefone = leia.nextLine();
			
			System.out.print("Digite o valor de crédito com Fornecedor: R$ ");
			double valorCredito = leia.nextDouble();
			
			System.out.print("Digite o valor de dívidas com Fornecedor: -R$");
			double valorDivida = leia.nextDouble();
 
			Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, cnpj, valorCredito, valorDivida);
			
			
			if(fornecedor.validaCnpj()) {
			fornecedor.printInfo();
			System.out.print("STATUS: Fornecedor válido \nSALDO C/ FORNECEDOR: "+fornecedor.obterSaldo());
			System.out.print("\n-----------------------------------------------");
			System.out.print("\nDeseja verificar Novamente o saldo de um fornecedor?\n1-SIM\n2-NÃO\nDigite sua opção: ");
			escolha=leia.nextInt();
			}
			else {
			System.out.print("------------------------------------------------------------------------------------------");
			System.out.print("\nSTATUS:Fornecedor inválido, por favor verifique a quantidade de caracteres do CNPJ");
			System.out.print("\n------------------------------------------------------------------------------------------");
			System.out.print("\nDeseja verificar Novamente o saldo de um fornecedor?\n1-SIM\n2-NÃO\nDigite sua opção: ");
			escolha=leia.nextInt();
			}
			
			leia.nextLine();
			}while(escolha!=2);
			System.out.println("OBRIGADO POR UTILIZAR NOSSA CONSULTA");	
			
		}
		
	}
}
