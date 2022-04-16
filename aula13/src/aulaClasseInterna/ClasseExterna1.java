package aulaClasseInterna;

public class ClasseExterna1 {

	private int var;
	
	public class ClasseInterna1 {		
		private void acessoInterno(){
			//TEM acesso imediato aos membros da classe externa
			var = 222;
		}		
		public int getVar(){ return var; }
	}//fim ClasseInterna
	
	public void acessoInterno(){   //ClasseExterna -> ClasseInterna
		var = 111;
		
		//ClasseInterna deve ser instanciada dentro da ClasseExterna
		ClasseInterna1 classeInterna = new ClasseInterna1();
		classeInterna.acessoInterno();
		System.out.println(var);
	}
	
	public static void main(String [] args){
		ClasseExterna1 classeExterna = new ClasseExterna1();
		classeExterna.acessoInterno();
		
		//ClasseInterna NÃO EH acessível		
		//ClasseInterna classeInterna = new ClasseInterna();
		ClasseExterna1.ClasseInterna1 obj = new ClasseExterna1().new ClasseInterna1();
		//ClasseInterna 'pode' ser instanciada dentro da ClasseExterna
		
	}

}
