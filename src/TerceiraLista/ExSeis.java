package TerceiraLista;
import java.util.Scanner;
public class ExSeis {
	public static void main(String[] args) {
		int num, soma=0, cont=0;
		
		try(Scanner leia = new Scanner(System.in)){
			do {
				System.out.print("Digite um n�mero: ");
				num = leia.nextInt();
				
				if(num%3==0) {
					if(num!=0) {
					soma=soma+num;
				    cont++;
				    }
					
				}
			}while(num!=0);
			
			if(cont==0)
			System.out.print("N�o fui digitado nenhum m�ltiplo de 3!");
			else
		    System.out.print("M�dia dos multiplos de 3 digitados: "+(soma/cont));
		}
	}
}
