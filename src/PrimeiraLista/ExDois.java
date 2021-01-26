package PrimeiraLista;
import java.util.Scanner;
public class ExDois {
	public static void main(String args[]) {
		int anos, meses, dias, dias_total;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("***Exercicio 2***");
			System.out.print("Digite o seu total de dias de vida: ");
			dias = leia.nextInt();
			anos = dias/365;
			meses = (dias%365)/30;
			dias_total = (dias%365)%30;
			System.out.println("Total de anos de vida: "+anos);
			System.out.println("Total de meses de vida: "+meses);
			System.out.println("Total de dias de vida: "+dias_total);
		}
	}
}
