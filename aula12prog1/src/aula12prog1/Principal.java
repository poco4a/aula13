package aula12prog1;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int num = 1/0;
		} catch (ArithmeticException e){
			e.printStackTrace();
		} finally {
			System.out.println("Sempre executa");
		}		

	}

}
