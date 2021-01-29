package QuartaLista;

import java.util.Scanner;
import java.util.Random;

public class ExDois {
	public static void main(String args[]) {
		try (Scanner leia = new Scanner(System.in)) {
			Random random = new Random();
			
			System.out.print("Digite o n�mero de vezes para sortear um n�mero do dado: ");
			int tam = leia.nextInt();
			
			int[] dado = new int[tam];
			int soma=0, maior=0, cont=0;
			
			System.out.print("N�meros Sorteados pelo dado: ");
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
			System.out.print("\nM�dia Aritm�tica dos lan�amentos: "+media);
			System.out.print("\nMaior valor lan�ado: ["+maior+"]");
			System.out.print("\nN�mero de vezes que o n�mero ["+maior+"] saiu: "+cont);
		}
		
	}
}
