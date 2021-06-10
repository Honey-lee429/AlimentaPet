package polimorfismo;

public class Preguica extends Animal{
	//construtor
	public Preguica() {
		super("Pregui�a", "Lari");
	}
	
	
	@Override
	public void idade(int idade) {
		System.out.println("Idade: "+10);
	}
	
	//m�todos sobrescritos
	@Override
	public void som(int som) {
		System.out.println("n�o emite som");
	}
	
	@Override
	public void corre(int corre) {
		System.out.println("pregui�a n�o corre");
	}
	
}
