package TerceiraLista;
import java.util.Scanner;
public class ExQuatro {
	public static void main(String args[]) {
		
		int totalParticipantes=0, idade, sexo, person;
		int p_calmas=0,o_calmos=0,p_calmasMenor=0,m_nervosas=0,maisnervosas=0,h_agressivos=0;
		try (Scanner leia = new Scanner(System.in)) {
			
			while(totalParticipantes<3) {
				System.out.print("Digite sua idade: ");
				idade=leia.nextInt();
				while(idade<1 || idade>120) {
					System.out.print("Digite uma idade válida: ");
					idade = leia.nextInt();
				}
				
				System.out.print("1-Feminino 2-Masculino 3-Outros\nDigite o seu sexo: ");
				sexo=leia.nextInt();
				while(sexo<1 || sexo>3) {
					System.out.print("Digite uma opção de sexo válida: ");
					sexo = leia.nextInt();
				}
				
				System.out.print("1-Calma 2-Nervosa 3-Agressiva\\nDigite a sua personalidade: ");
				person=leia.nextInt();
				while(person<1 || person>3) {
					System.out.print("Digite uma opção de personalidade válida: ");
					person = leia.nextInt();
				}
				
				if(person==1){
					p_calmas++;
					if(sexo==3)
					o_calmos++;
					if(idade<18)
					p_calmasMenor++;
				}
				else if(person==2){
					if(sexo==1)
					m_nervosas++;
					if(idade>40)
					maisnervosas++;
				}
				else if(sexo==2 && person==3){
					h_agressivos++;
				}
				System.out.println("***********************************************");
				totalParticipantes++;
			}
			System.out.println("---RESULTADOS---");
			System.out.println("Total de pessoas calmas: "+p_calmas);
			System.out.println("Total de mulheres nervosas: "+m_nervosas);
			System.out.println("Total de homens agressivos: "+h_agressivos);
			System.out.println("Total de outros calmos: "+o_calmos);
			System.out.println("Total de pessoas nervosas com mais de 40 anos: "+maisnervosas);
			System.out.println("Total de pessoas com menos de 18 anos calmas: "+p_calmasMenor);
		}
	}

}
