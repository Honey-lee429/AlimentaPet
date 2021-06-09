
public class Cachorro extends ClassePrincipal{
private String castrado;
	
	public Cachorro(String nome, int idade, double peso, String porte, String genero, String castrado) {
		super(nome, idade, peso, porte, genero);
		this.castrado = castrado; 
	}
	
	public void mostrarInfo() {
		System.out.println("a");
		System.out.println("Nome do Cachorro: " + getNome());
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	
	
	
	
	//criar método calcular quantidade de ração
}
