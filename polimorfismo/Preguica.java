package polimorfismo;

public class Preguica extends Animal{
	//construtor
	public Preguica() {
		super("Preguiça", "Lari");
	}
	
	
	@Override
	public void idade(int idade) {
		System.out.println("Idade: "+10);
	}
	
	//métodos sobrescritos
	@Override
	public void som(int som) {
		System.out.println("não emite som");
	}
	
	@Override
	public void corre(int corre) {
		System.out.println("preguiça não corre");
	}
	
}
