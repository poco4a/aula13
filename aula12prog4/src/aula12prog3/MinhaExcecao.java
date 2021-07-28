package aula12prog3;

public class MinhaExcecao extends ArithmeticException {
	
	private static final long serialVersionUID = 1L;

	//Mensagem padrao
	public MinhaExcecao(){
		super("Minha excecao personalizada");
	}
	
	//Mensagem personalizada
	public MinhaExcecao(String m){
		super(m);
	}
	
}
