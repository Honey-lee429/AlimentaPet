package polimorfismo;
//subclasse � obrigat�rio ter todos os m�todos abstratos da Super Classe
public class Publico extends Telefone {
	public Publico() {
		super("Orelh�o");
	}
	
	@Override //indica que sobrescreve um m�todo abstrado e � obrigat�rio indicar quando implementamos um metodo abastrato na subclasse
	//implementar os m�todos abstratos da superclasse
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("plin, plin");
		}
	}
	
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("Este telefone n�o liga para celular");
		}
		else {
			System.out.println("Dicando: " + numero);
		}
	}
	
}
