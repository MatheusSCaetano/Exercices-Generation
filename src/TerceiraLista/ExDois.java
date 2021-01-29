package TerceiraLista;
import java.util.Scanner;
public class ExDois {
	public static void main(String args[]) {
		int num, parTotal=0, imparTotal=0;
		try(Scanner leia = new Scanner(System.in)){
			for(int i =0;i<10;i++) {
				System.out.print("Digite o "+(i+1)+"º número: ");
				num = leia.nextInt();
				if(num%2==0)
					parTotal++;
				else
					imparTotal++;	
			}
			System.out.print("Total de número pares digitados: "+parTotal+"\nTotal de números impares digitados: "+imparTotal);
		}
	}

}
