package aulaClasseInterna;

public class ClasseExterna3 {

	private int var;
	
	//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
	//private static class ClasseInterna3 {		
	//public static class ClasseInterna3 { //Nao faz sentido public+static para classe interna, 
	//                                     pq 'static' proibe o acesso fora da classe externa
	private static class ClasseInterna3 {
		private void acessoInterno(){
			//NÃO TEM acesso aos membros da classe externa
			//var = 222;
			//acessoExterno3();
		}		
	}//fim ClasseInterna
	
	public void acessoExterno3(){
		var = 111;
		ClasseInterna3 classeInterna = new ClasseInterna3();
		classeInterna.acessoInterno();
		System.out.println(var);
	}
	
	//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
	public static void main(String [] args){
		ClasseExterna3 classeExterna = new ClasseExterna3();
		classeExterna.acessoExterno3();
		
		//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
		ClasseInterna3 classeInterna = new ClasseInterna3();
		classeInterna.acessoInterno();
		
		//Não
		//ClasseExterna3.ClasseInterna3 obj = new ClasseExterna3().new ClasseInterna3();
	}

}
