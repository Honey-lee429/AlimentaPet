package polimorfismo;
//subclasse é obrigatório ter todos os métodos abstratos da Super Classe
public class Celular extends Telefone {
	//construtor
	public Celular() {
		super("Celular"); 
	}
	
	@Override //indica que sobrescreve um método abstrado e é obrigatório indicar quando implementamos um metodo abastrato na subclasse
	//implementar os métodos abstratos da superclasse
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Ding dong");
			break;
		case 2:
			System.out.println("Alien");
			break;
		default:
			System.out.println("Bip");
		}
	}
	
	@Override 
	public void disca(String numero) {
		System.out.println("O número: "+ numero + "é um celular.");
	}
}
