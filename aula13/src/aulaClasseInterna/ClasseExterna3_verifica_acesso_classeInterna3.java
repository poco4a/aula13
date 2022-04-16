package aulaClasseInterna;

public class ClasseExterna3_verifica_acesso_classeInterna3 {
	
	public static void main(String [] args){
		ClasseExterna3 classeExterna = new ClasseExterna3();
		classeExterna.acessoExterno3();
		
		//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
		//ClasseInterna3 classeInterna = new ClasseInterna3();
		//classeInterna.acessoExterno();
		
		//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
		//ClasseExterna3.ClasseInterna3 classeInterna = new ClasseExterna3().new ClasseInterna3();
		
	}

}
