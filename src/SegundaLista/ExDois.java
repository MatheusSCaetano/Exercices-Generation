package SegundaLista;
import java.util.Scanner;
public class ExDois {
	public static void main(String[] args) {
    
		try(Scanner leia = new Scanner(System.in)){
			System.out.print("Digite o 1� n�mero inteiro: ");
			int a = leia.nextInt();
			System.out.print("Digite o 2� n�mero inteiro: ");
			int b = leia.nextInt();
			System.out.print("Digite o 3� n�mero inteiro: ");
			int c = leia.nextInt();
			int aux;
			 if (a > b) {
                 aux = a;
                 a = b;
                 b = aux;
             }

             if (b > c) {
                 aux = b;
                 b = c;
                 c = aux;
             }
              
             if (a > b) {
                 aux = a;
                 a = b;
                 b = aux;
             }
             
			System.out.println("Ordem crescente: " + a + " " + b + " "+ c);
		}
	}
}
