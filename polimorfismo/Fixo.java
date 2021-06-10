package polimorfismo;
//subclasse é obrigatório ter todos os métodos abstratos da Super Classe
public class Fixo extends Telefone {
	public Fixo() {
		super("Telefone Fixo");
	}
	@Override //indica que sobrescreve um método abstrado e é obrigatório indicar quando implementamos um metodo abastrato na subclasse
	//implementar os métodos abstratos da superclasse
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("plin, plin");
		}
	}
	
	public void disca(String numero) {
		System.out.println("Discando: "+numero);
	}
}
