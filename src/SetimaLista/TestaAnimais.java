package SetimaLista;

import java.util.Scanner;

public class TestaAnimais {
static void  linha() {
		System.out.println("-------------------------------------------------------------");
	}

 public static void main(String[] args) {
	try(Scanner leia = new Scanner (System.in)){
	int opcao;
	Cachorro cachorro = new Cachorro("Rex",2);
	Cavalo cavalo = new Cavalo("Alipio", 7);
	Preguica preguica = new Preguica("Sid", 14);
	
	System.out.println("***BEM VINDO AO ANIMAL INTERACTION***");
	linha();
	do {
	
	Animal animal = null;
	System.out.print("***MENU DE ESCOLHA ANIMAL***\n1-Cachorro\n2-Cavalo\n3-Preguiça\n4-Sair\nDigite um animal para você interagir: ");
	opcao = leia.nextInt();
	String oanimal="";
	while(opcao<1 || opcao>4) {
		linha();
		System.out.print("***AVISO: DIGITE UMA OPÇÃO VÁLIDA***\n1-Cachorro\n2-Cavalo\n3-Preguiça\n4-Sair\nDigite um animal para você interagir: ");
		opcao = leia.nextInt();
	}
	if(opcao!=4) {
	switch(opcao) {
	case 1: animal=cachorro; oanimal="Cachorro"; break;
	case 2: animal=cavalo; oanimal="Cavalo";break;
	case 3: animal=preguica; oanimal="Preguiça";break;
	default:System.out.println("Valor Incorreto"); break;
	}
	linha();
	System.out.println("******Você escolheu interagir com nosso(a) "+oanimal+"******");
	animal.printInfo();
	int opcao2;
	do {
	linha();
	System.out.print("***MENU DE INTERAÇÃO***\n1-Emitir Barulho\n2-Locomover\n3-Pare\n4-Interagir com outro animal\nDigite sua opção de interação com "+animal.getNome()+":");
	opcao2= leia.nextInt();
	
	while(opcao2<1 || opcao2>4) {
		linha();
		System.out.print("***AVISO: DIGITE UMA OPÇÃO VÁLIDA***\n1-Emitir Barulho\n2-Locomover\n3-Pare\n4-Interagir com outro animal\nDigite sua opção de interação com "+animal.getNome()+":");
		opcao2= leia.nextInt();
	}
	
	linha();
	if(opcao2==1)
		animal.emitirSom(1);
	else if(opcao2==2)
		animal.locomovendo();
	else if(opcao2==3)
		animal.pare();
	}while(opcao2!=4);
	}
	
	else {
		linha();
		System.out.println("Obrigado por utilizar nosso app :)");
	}
	
	}while(opcao!=4);
	
	}
 }
}
