package polimorfismo;
//subclasse � obrigat�rio ter todos os m�todos abstratos da Super Classe
public class Celular extends Telefone {
	//construtor
	public Celular() {
		super("Celular"); 
	}
	
	@Override //indica que sobrescreve um m�todo abstrado e � obrigat�rio indicar quando implementamos um metodo abastrato na subclasse
	//implementar os m�todos abstratos da superclasse
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
		System.out.println("O n�mero: "+ numero + "� um celular.");
	}
}
