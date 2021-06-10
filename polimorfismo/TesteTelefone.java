package polimorfismo;

public class TesteTelefone {
	public static void main(String[] args) {
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		Telefone telefone = null; //uma classe abstrata não pode ser instanciada, ou seja não tem o new. Ela é uma variavel que tem o conteúdo null.
		
		int n = (int) (Math.random()*3.0);
		System.out.println("Número escolhido: " + n);
		
		switch(n) {
		case 0: telefone = celular; break;
		case 1: telefone = fixo; break;
		case 2: telefone = publico; break;
		default: System.out.println("Você não tem crédito suficiente");		
		}
		
		if(telefone != null) {
			telefone.disca("93254545");
			telefone.toca(1);
		}
		
		
	}
}
