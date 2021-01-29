package QuartaLista;
import java.util.Scanner;
public class ExQuatro {
	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int[][] m = new int[3][3];
			int somaTotal=0, somaDiagPrin=0;
			for(int i=0;i<3;i++) {
				System.out.println("Valores da "+(i+1)+"º linha da Matriz");
				for(int j = 0;j<3;j++) {
					System.out.print("Digite o valor da posição ["+(i+1)+"]["+(j+1)+"]:");
					m[i][j]=leia.nextInt();
					somaTotal=somaTotal+m[i][j];
					if(i==j) {
						somaDiagPrin=somaDiagPrin+m[i][j];
					}
				}
				if(i!=2)
				System.out.print("\n");
			}
			
			System.out.println("***********************************************");
			System.out.println("Matriz Final: ");
			for(int i = 0;i<3;i++) {
				for(int j = 0; j<3; j++) {
					System.out.print("["+m[i][j]+"]");
				}
				if(i!=2)
				System.out.print("\n");
			}
			System.out.println("\n***********************************************");
			System.out.print("Soma de todos os valores da Matriz: "+somaTotal);
			System.out.print("\nSoma da Diagonal Principal: "+somaDiagPrin);
		}
		
	}
}
