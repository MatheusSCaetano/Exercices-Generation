package SetimaLista;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom(int quantidade) {
		for(int i=0; i<quantidade;i++) {
		System.out.println(getNome()+": Au Au Au ... Au Au Au");
		}
	}
	
	@Override
	public void locomovendo() {
		System.out.println(getNome()+" está Correndo...");
	}
	
	@Override
	public void pare() {
	   System.out.println(getNome()+" está Sentado...");	
	}
	
}
