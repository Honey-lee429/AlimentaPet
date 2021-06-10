package polimorfismo;
// Superclasse abstrata
public abstract class Animal {
	private String tipo;
	private String nome;
	abstract public void idade (int idade);
	abstract public void som (int som); 
	abstract public void corre (int corre);
	
	//construtor
	public Animal(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
		System.out.println("\nO tipo do animal é: " + this.tipo + "\ne o nome é: " + this.nome);
	}
	
	//métodos
	public String getTipo() {
		return tipo;
	}
	
	//get and set
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
