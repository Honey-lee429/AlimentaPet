package polimorfismo;
//subclasse � obrigat�rio ter todos os m�todos abstratos da Super Classe
public class Dog extends Animal {
	//construtor
	public Dog() {
		super("Dog", "Gui");
	}
	
	@Override
	//m�todo sobrescrito
	public void idade(int idade) {
		int ram = (int) (1 + Math.random()*(10-1));
		System.out.println("\nO Doguinho tem: " + ram + " ano(s).");
	}
	
	@Override
	public void som(int som) {
		System.out.println("Cachorro faz Auau");
	}
	
	@Override
	public void corre(int corre) {
		switch(corre) {
		case 1: System.out.println("Cachorro est� dormindo, n�o corre"); break;
		case 2: System.out.println("Cachorro est� comendo, n�o corre"); break;
		case 3: System.out.println("Cachorro fugiu, ele corre pra burro"); break;
		default: System.out.println("N�o � cachorro");
		}
	}
}
