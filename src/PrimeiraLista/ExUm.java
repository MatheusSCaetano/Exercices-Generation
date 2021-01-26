package PrimeiraLista;

import java.util.Scanner;

public class ExUm {
	public static void main(String args[]) {
		int anos, meses, dias;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("***Exercicio 1***");
			System.out.print("Digite a sua idade em anos: ");
			anos = leia.nextInt();
			System.out.print("Digite a sua idade em meses: ");
			meses = leia.nextInt();
			System.out.print("Digite a sua idade em dias: ");
			dias = leia.nextInt();
			dias = dias + anos*365 + meses*30;
			System.out.print("Total de dias de vida é: "+dias);
		}
	}
}
