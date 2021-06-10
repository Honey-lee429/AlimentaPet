package polimorfismo;

import java.util.Scanner;

//subclasse 
public class Horse extends Animal {
		Scanner ler = new Scanner(System.in);
		int age=0;
		
		//construtor
		public Horse() {
			super("Cavalo", "Mario");
		}
	
		//m�todos sobrescritos
			@Override
		public void idade(int idade) {
			System.out.println("Qual a idade do cavalo?");
			age = ler.nextInt();
		}
		
		@Override
		public void som(int som) {
			System.out.println("Este animal relincha se voc� relichar para ele.");
		}
		
		@Override
		public void corre(int corre) {
			if(corre == 1) {
				System.out.println("Esta parado. Solte a redea");
			}
			else if(corre == 2) {
				System.out.println("Cavalo est� andando");
			}
			else if(corre == 3) {
				System.out.println("Cavalor est� correndo");
			}
			else {
				System.out.println("Isto � um jegue");
			}
		}
}
