package aula12prog3;

public class Principal {

	public static void divisor(int num) throws SubExcecao{
		
		try {
			int resultado = 1/num;
		} catch (Exception e){
			throw new SubExcecao();
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			divisor(0); //'Pode' disparar a excecao
		} catch (SubExcecao e){
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Sempre executa");
		}
		

	}

}
