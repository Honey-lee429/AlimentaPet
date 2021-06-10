package polimorfismo;
//subclasse � obrigat�rio ter todos os m�todos abstratos da Super Classe
public class Fixo extends Telefone {
	public Fixo() {
		super("Telefone Fixo");
	}
	@Override //indica que sobrescreve um m�todo abstrado e � obrigat�rio indicar quando implementamos um metodo abastrato na subclasse
	//implementar os m�todos abstratos da superclasse
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("plin, plin");
		}
	}
	
	public void disca(String numero) {
		System.out.println("Discando: "+numero);
	}
}
