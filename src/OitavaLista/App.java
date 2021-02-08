package OitavaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static List<Produto> listaprodutos = new ArrayList<Produto>();
	
	static Scanner leia = new Scanner(System.in);
	
	public static void vendedor() {
		int op;
		do {
		
		System.out.println("\n           Digite uma opção: "           );
		System.out.println("----------------------------------------");
		System.out.println("(1)Deseja realizar uma venda\n(2)Deseja mostrar produtos\n(0)Encerrar programa");
		System.out.println("----------------------------------------");
		System.out.print("Digite sua escolha: ");
		op = leia.nextInt();
		System.out.println("----------------------------------------");
		
		switch(op){
		case 1:
			
			break;
			
			case 2:
				System.out.println("ID       PRODUTO        QUANTIDADE");
				System.out.println("----------------------------------");
				for(Produto p:listaprodutos) {
					System.out.println(p);
				}
				System.out.println("----------------------------------");
				break;
				
		}
		}while(op!=0);
	}
	
	public static void administrador() {
		
		int op;
		int id=0;
		
		do {
		System.out.println("\n           Digite uma opção: "           );
		System.out.println("----------------------------------------");
		System.out.println("(1)Deseja adicionar um novo produto\n(2)Deseja remover produto\n(3)Atualizar Nome do produto\n(4)Adicionar Estoque do produto\n(5)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
		System.out.println("----------------------------------------");
		System.out.print("Digite sua escolha: ");
		op = leia.nextInt();
		System.out.println("----------------------------------------");
		
		while(op<0 || op>5) {
			System.out.println("AVISO: DIGITE UMA OPÇÃO VÁLIDA");
			System.out.println("\n           Digite uma opção: "           );
			System.out.println("----------------------------------------");
			System.out.println("(1)Deseja adicionar um novo produto\n(2)Deseja remover produto\n(3)Atualizar Nome do produto\n(4)Adicionar Estoque do produto\n(5)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
			System.out.println("----------------------------------------");
			System.out.print("Digite sua escolha: ");
			op = leia.nextInt();
			System.out.print("Digite sua escolha: ");
		}
		
		switch(op) {
		case 1:
			leia.nextLine();
			System.out.print("Digite o nome do produto:");
			String nome = leia.nextLine();
			System.out.print("Digite a quantidade do produto em estoque:");
			int idade = leia.nextInt();
			id++;
			listaprodutos.add(new Produto(id,nome, idade));
			System.out.println("----------------------------------------");
			System.out.println("   PRODUTO ADICIONADO COM SUCESSO!      ");
			System.out.println("----------------------------------------");
			break;
			
			
		case 2:
			if(listaprodutos.size()==0) {
				System.out.println("AVISO: Seu estoque ainda não possui produtos");
				System.out.println("----------------------------------------");
			}else {
			int cont=0;
			System.out.print("Digite o id do produto para remover do estoque: ");
			int idp = leia.nextInt();
			for(int i=0;i<listaprodutos.size();i++) {
				if(listaprodutos.get(i).getId()==idp) {
					cont++;
					listaprodutos.remove(i);
				}
			}
			
			if(cont==0) {
				System.out.println("AVISO: Não foi encontrado nenhum produto com este id!");
			}
			else {
				System.out.println("----------------------------------------");
				System.out.println("     PRODUTO REMOVIDO COM SUCESSO!      ");
				System.out.println("----------------------------------------");
			}
			}
			break;
		case 3:
			if(listaprodutos.size()==0) {
				System.out.println("AVISO: Seu estoque ainda não possui produtos");
				System.out.println("----------------------------------------");
			}
			else {
			int cont2=0;
			System.out.println("Digite o id do produto para atualizar no estoque:");
			int idp2 = leia.nextInt();
			for(Produto p:listaprodutos) {
				if(p.getId()==idp2) {
					leia.nextLine();
					System.out.print("Digite o novo nome do produto: ");
					String novo=leia.nextLine();
					p.setNome(novo);
					cont2++;
				}
			}
			
			if(cont2==0) {
				System.out.println("AVISO: Não foi encontrado nenhum produto com este id!");

			}
			else {
				System.out.println("----------------------------------------");
				System.out.println("     PRODUTO ATUALIZADO COM SUCESSO!    ");
				System.out.println("----------------------------------------");
			}
			}
			break;
		case 4:
			if(listaprodutos.size()==0) {
				System.out.println("AVISO: Seu estoque ainda não possui produtos");
				System.out.println("----------------------------------------");
			}
			else {
			int cont2=0;
			System.out.println("Digite o id do produto para adicionar uma quantidade no estoque:");
			int idp2 = leia.nextInt();
			for(Produto p:listaprodutos) {
				if(p.getId()==idp2) {
					leia.nextLine();
					System.out.print("Digite a quantidade a ser adicionada: ");
					int maisestoque=leia.nextInt();
					p.adicionaEstoque(maisestoque);
					cont2++;
				}
			}
			
			if(cont2==0) {
				System.out.println("AVISO: Não foi encontrado nenhum produto com este id!");

			}
			else {
				System.out.println("----------------------------------------");
				System.out.println("     PRODUTO ATUALIZADO COM SUCESSO!    ");
				System.out.println("----------------------------------------");
			}
			}
			break;
			
		case 5:
			System.out.println("ID       PRODUTO        QUANTIDADE");
			System.out.println("----------------------------------");
			for(Produto p:listaprodutos) {
				System.out.println(p);
			}
			System.out.println("----------------------------------");
			break;
			
		default:
			System.out.println("Obrigado por utilizar nosso app! :)");

		}
		}while(op!=0);
	}

	public static void menu() {
		System.out.println("\n           Entre com seu perfil: "           );
		System.out.println("----------------------------------------");
		System.out.println("(1)Adminstrador\n(2)Vendedor\n(0)Sair");
		System.out.println("----------------------------------------");
		System.out.print("Digite sua escolha: ");
	}
	
	public static void main(String[] args) {
		int op;
		do {
		menu();
		op = leia.nextInt();
		System.out.println("----------------------------------------");
		while(op<0 || op>2) {
			System.out.println("AVISO: DIGITE UMA OPÇÃO VÁLIDA");
			System.out.println("----------------------------------------");
			menu();
			op = leia.nextInt();
		}
		
		if(op==1) {
			leia.nextLine();
			System.out.print("Digite a senha para acessar o perfil de ADM: ");
			String senha=leia.nextLine();
			
			if(senha.equals("ADM123")) {
				System.out.println("Acesso liberado...");
				administrador();
				}
			else
				System.out.println("Senha Incorreta");
		}
		else if(op==2){
			leia.nextLine();
			System.out.print("Digite a senha para acessar o perfil de Vendedor: ");
			String senha=leia.nextLine();
			if(senha.equals("123")) {
				System.out.println("Acesso liberado...");
				vendedor();}
			else
				System.out.println("Senha Incorreta");
		}
		else {
			System.out.println("Obrigado por utilizar nosso app!");
		}
		
		}while(op!=0);
	}
	
}
