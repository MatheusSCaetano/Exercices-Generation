package SetimaLista;

public class Cavalo extends Animal {
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom(int quantidade) {
		for(int i = 0; i<quantidade;i++) {
		System.out.println(getNome()+": hinn in in... hinn in in");
		}
	}
	
	@Override
	public void locomovendo() {
	   System.out.println(getNome()+" está Trotando...");
	}
	
	@Override
	public void pare() {
		System.out.println(getNome()+"está Parado...");
	}

}
