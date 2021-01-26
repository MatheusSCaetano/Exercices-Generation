package PrimeiraLista;
import java.util.Scanner;
public class ExCinco {
 public static void main(String args[]) {
	 double n1,n2,n3,media;
	 String nome, materia;
	 try(Scanner leia = new Scanner(System.in)){
		 System.out.println("***Exercicio 5***");
		 System.out.print("Digite o nome do aluno: ");
		 nome = leia.next();
		 System.out.print("Digite o nome da matéria: ");
		 materia = leia.next();
		 System.out.print("Digite a 1º Nota: ");
		 n1 = leia.nextDouble();
		 System.out.print("Digite a 2º Nota: ");
		 n2 = leia.nextDouble();
		 System.out.print("Digite a 3º Nota: ");
		 n3 = leia.nextDouble();
		 media = ((n1*2)+(n2*3)+(n3*5))/10;
		 System.out.print("Nome do aluno: "+nome+"\nNome da matéria: "+materia+"\nMédia: "+media);
	 }
 }
}
