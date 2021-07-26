package aula12prog2;

public class Principal {

	public static void divisor(int num) throws MinhaExcecao{
		
		try {
			int resultado = 1/num;
		} catch (Exception e){
			throw new MinhaExcecao();
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			divisor(0); //'Pode' disparar a excecao
		} catch (MinhaExcecao e){
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Sempre executa");
		}
		

	}

}
