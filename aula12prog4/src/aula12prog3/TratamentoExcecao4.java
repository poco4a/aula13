package aula12prog3;

public class TratamentoExcecao4 {

	public static void main(String [] args){
		
		try{
			/*
			 * TODO: 1) Dispara a excecao
			 */
			dispararExcecao1();
		} catch (Exception e){
			System.out.println("Excecao3");
		}
		
		metodoSemExcecao();
		
	}//fim main
	
	public static void dispararExcecao1() throws Exception {
				
		try{
			/*
			 * TODO: 2) Captura e Dispara uma nova excecao, e jah a captura novamente
			 */
			System.out.println("Excecao1");
			throw new Exception();
		} catch (Exception e){
			/*
			 * TODO: 3) Captura e Dispara uma nova excecao. 
			 */
			System.out.println("Excecao2");
			throw e; //Redispara (rethrow) a excecao para tratamento fora do método.
			         //Nao usou 'new throw' porque estah passando a excecao adiante,
			         //  e nao criando uma nova.
		}
		
	}
	
	public static void metodoSemExcecao(){
		
		try {
			System.out.println("Sem excecao: 4");
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Sem excecao: 5. Finally.");
		}
	}
}
