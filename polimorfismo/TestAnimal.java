package polimorfismo;

import java.util.Scanner;

public class TestAnimal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int write;
		System.out.println("Digite uma opção de 1 a 3");
		write = leia.nextInt();
		
		if(write == 1) {
			int x = (int) (Math.random()*4);
			System.out.println(x);
			Dog dog = new Dog();
			dog.idade(0);
			dog.som(0);
			dog.corre(x);
		}
		else if(write == 2) {
			int x = (int) (Math.random()*4);
			Horse cavalo = new Horse();
			cavalo.idade(0);
			cavalo.som(0);
			cavalo.corre(x);
		}
		else {
			Preguica preguica = new Preguica();
			preguica.idade(0);
			preguica.som(0);
			preguica.corre(0);
		}
		
		
		
		
		
	}
}
