package polimorfismo;
//subclasse é obrigatório ter todos os métodos abstratos da Super Classe
public class Publico extends Telefone {
	public Publico() {
		super("Orelhão");
	}
	
	@Override //indica que sobrescreve um método abstrado e é obrigatório indicar quando implementamos um metodo abastrato na subclasse
	//implementar os métodos abstratos da superclasse
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("plin, plin");
		}
	}
	
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("Este telefone não liga para celular");
		}
		else {
			System.out.println("Dicando: " + numero);
		}
	}
	
}
