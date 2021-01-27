package SegundaLista;
import java.util.Scanner;
public class ExUm {
	public static void main(String[] args) {
		
		try(Scanner leia = new Scanner(System.in)){
			System.out.print("Digite o 1º número inteiro: ");
			int a = leia.nextInt();
			System.out.print("Digite o 2º número inteiro: ");
			int b = leia.nextInt();
			System.out.print("Digite o 3º número inteiro: ");
			int c = leia.nextInt();
			int maior = c;
			if(a>maior)
				maior=a;
			if(b>maior)
				maior=b;
			System.out.print("O número maior é: "+maior);
		}
	}
}
