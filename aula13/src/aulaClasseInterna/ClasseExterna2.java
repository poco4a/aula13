package aulaClasseInterna;

public class ClasseExterna2 {

	private int var;
	
	//protected class ClasseInterna2 {		
	public class ClasseInterna2 {
		private void acessoInterno(){
			//TEM acesso imediato aos membros da classe externa
			var = 222;
		}		
	}//fim ClasseInterna
	
		
	public void acessoInterno(){
		var = 111;
		
		//ClasseInterna deve ser instanciada dentro da ClasseExterna
		ClasseInterna2 classeInterna = new ClasseInterna2();
		classeInterna.acessoInterno();
		System.out.println(var);
	}
	
	public static void main(String [] args){
		//1)
		ClasseExterna2 classeExterna = new ClasseExterna2();
		classeExterna.acessoInterno();
		
		//ClasseInterna NÃO EH acessível
		//ClasseInterna2 classeInternaA = new ClasseInterna2();
		//ClasseInterna 'pode' ser instanciada dentro da ClasseExterna
		//2)
		ClasseExterna2.ClasseInterna2 classeInterna = new ClasseExterna2().new ClasseInterna2();
		
	}

}
