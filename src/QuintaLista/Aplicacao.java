package QuintaLista;

import java.util.Scanner;

public class Aplicacao {
public static void main(String[] args) {
	try (Scanner leia = new Scanner(System.in)) {
		System.out.println("---Teste da Classe Cliente---");
		Cliente cliente1 = new Cliente("Matheus","111.111.111-11", "Masculino", "teste@teste.com", "11 99999-9999");
		cliente1.comprarProduto();
		cliente1.devolverProduto();
		cliente1.comprarProduto();
		cliente1.printInfo();
		//----------------------------------------------------------------------------------------------------------
		System.out.println("\n---Teste da Classe Funcionario---");
	    System.out.print("Digite o nome do funcionário: ");
	    String nome = leia.nextLine();
	    System.out.print("Digite o CPF do funcionário: ");
	    String cpf = leia.nextLine();
	    System.out.print("Digite o RG do funcionário: ");
	    String rg = leia.nextLine();
	    System.out.print("Digite o sexo do funcionário: ");
	    String sexo = leia.nextLine();
	    System.out.print("Digite o email do funcionário: ");
	    String email = leia.nextLine();
	    System.out.print("Digite a data de nascimento do funcionário: ");
	    String data_nas = leia.nextLine();
	    System.out.print("Digite a matricula do funcionário: ");
	    String matricula = leia.nextLine();
	    System.out.print("Digite o cargo do funcionário: ");
	    String cargo = leia.nextLine();
	    System.out.print("Digite o salario do funcionário: ");
	    double salario = leia.nextDouble();
	    Funcionario funcionario1 = new Funcionario(nome,cpf,rg,sexo,email,data_nas,matricula,cargo,salario);
	    funcionario1.printInfo();
	    funcionario1.setCargo("Desenvolvedor Java Pleno");
	    funcionario1.aumentarSalario(10);
	    System.out.print("\n");
	    funcionario1.printInfo();
	    //----------------------------------------------------------------------------------------------------------
	    System.out.println("\n---Teste da Classe Avião---");
	    String fabricante, modelo, cor;
	    int lugares;
	    Aviao[] avioes = new Aviao[3];
	    for(int i =0; i<avioes.length;i++) {
	    	leia.nextLine();
	    	System.out.print("Digite o fabricante da aeronave: ");
	    	fabricante = leia.nextLine();
	    	System.out.print("Digite o modelo da aeronave: ");
	    	modelo = leia.nextLine();
	    	System.out.print("Digite a cor da aeronave: ");
	    	cor = leia.nextLine();
	    	System.out.print("Digite a quantidade de lugares da aeronave: ");
	    	lugares = leia.nextInt();
	    	avioes[i]=new Aviao(fabricante, modelo, cor, lugares);
	    	System.out.println("-----------------------------------------");
	    }
	    System.out.print("\nBD de Aeronaves\n");
	    
	    for(Aviao x:avioes) {
	    	x.printInfo();
	    }
	    
	    avioes[0].statusVoando();
	    avioes[1].statusVoando();
	    
	    System.out.print("\nBD de Aeronaves\n");
	    for(Aviao x:avioes) {
	    	x.printInfo();
	    }
	    
	}
		
}

}
