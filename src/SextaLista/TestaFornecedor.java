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
			
			System.out.print("Digite o endere�o do Fornecedor: ");
			String endereco = leia.nextLine();
			
			System.out.print("Digite o telefone de contato do Fornecedor: ");
			String telefone = leia.nextLine();
			
			System.out.print("Digite o valor de cr�dito com Fornecedor: R$ ");
			double valorCredito = leia.nextDouble();
			
			System.out.print("Digite o valor de d�vidas com Fornecedor: -R$");
			double valorDivida = leia.nextDouble();
 
			Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, cnpj, valorCredito, valorDivida);
			
			
			if(fornecedor.validaCnpj()) {
			fornecedor.printInfo();
			System.out.print("STATUS: Fornecedor v�lido \nSALDO C/ FORNECEDOR: "+fornecedor.obterSaldo());
			System.out.print("\n-----------------------------------------------");
			System.out.print("\nDeseja verificar Novamente o saldo de um fornecedor?\n1-SIM\n2-N�O\nDigite sua op��o: ");
			escolha=leia.nextInt();
			}
			else {
			System.out.print("------------------------------------------------------------------------------------------");
			System.out.print("\nSTATUS:Fornecedor inv�lido, por favor verifique a quantidade de caracteres do CNPJ");
			System.out.print("\n------------------------------------------------------------------------------------------");
			System.out.print("\nDeseja verificar Novamente o saldo de um fornecedor?\n1-SIM\n2-N�O\nDigite sua op��o: ");
			escolha=leia.nextInt();
			}
			
			leia.nextLine();
			}while(escolha!=2);
			System.out.println("OBRIGADO POR UTILIZAR NOSSA CONSULTA");	
			
		}
		
	}
}
