package TerceiraLista;
import java.util.Scanner;
public class ExSeis {
	public static void main(String[] args) {
		int num, soma=0, cont=0;
		
		try(Scanner leia = new Scanner(System.in)){
			do {
				System.out.print("Digite um número: ");
				num = leia.nextInt();
				
				if(num%3==0) {
					if(num!=0) {
					soma=soma+num;
				    cont++;
				    }
					
				}
			}while(num!=0);
			
			if(cont==0)
			System.out.print("Não fui digitado nenhum múltiplo de 3!");
			else
		    System.out.print("Média dos multiplos de 3 digitados: "+(soma/cont));
		}
	}
}
