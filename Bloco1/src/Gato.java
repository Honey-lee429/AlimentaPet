import java.util.Scanner;


public class Gato extends ClassePrincipal{
	Scanner ler = new Scanner(System.in);
	int x;
	
	public Gato(String nome, int idade) {
		super(nome,idade);
		System.out.println("Qual o nome do seu pet? " + nome + "\nQual a idade do seu pet? " + idade);
		x = ler.nextInt();
	}
		
	@Override
	public void peso(double peso) {
		//pedir peso
	}
	
	@Override
	public void porte(String porte) {
		//pedir porte
	}
	
<<<<<<< HEAD
	@Override
	public void genero(String genero) {
		//pedir genero
	}
}
=======
		public void setRacao(String racao) {
			this.racao = racao;
		}
		
		//criar m�todo calcular quantidade de ra��o
		
		
>>>>>>> c7ce5d7938cf7fe878fc71ae465e33b50eb07493
