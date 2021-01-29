package QuartaLista;

import java.util.Scanner;
import java.util.Random;

public class ExDois {
	public static void main(String args[]) {
		try (Scanner leia = new Scanner(System.in)) {
			Random random = new Random();
			
			System.out.print("Digite o número de vezes para sortear um número do dado: ");
			int tam = leia.nextInt();
			
			int[] dado = new int[tam];
			int soma=0, maior=0, cont=0;
			
			System.out.print("Números Sorteados pelo dado: ");
			for(int i =0; i<dado.length;i++) {
				do {
					dado[i]=random.nextInt(6+1);
				}while(dado[i]==0);
				
				if(i==0)
					maior=dado[i];
				if(dado[i]>maior) {
					cont=0;
					maior=dado[i];
				}
				if(dado[i]==maior)
					cont++;
				
				soma=soma+dado[i];
				System.out.print("["+dado[i]+"]");
			}
			double media = (double)soma/(double)tam;
			System.out.print("\n----------DADOS SOLICITADOS----------");
			System.out.print("\nMédia Aritmética dos lançamentos: "+media);
			System.out.print("\nMaior valor lançado: ["+maior+"]");
			System.out.print("\nNúmero de vezes que o número ["+maior+"] saiu: "+cont);
		}
		
	}
}
