package SetimaLista;

public class Preguica extends Animal {

 public Preguica(String nome, int idade) {
	 super(nome, idade);
 }
 
 @Override
 public void emitirSom(int quantidade){
	 for(int i=0;i<quantidade; i++) {
	 System.out.println(getNome()+": N�s vamos morrer - Meeeny");
	 }
 }
 
 @Override
	public void locomovendo() {
		System.out.println(getNome()+" est� Subindo na arvore...");
	}
 
 @Override
 public void pare() {
	 System.out.println(getNome()+" est� Parada...");
 }
}
