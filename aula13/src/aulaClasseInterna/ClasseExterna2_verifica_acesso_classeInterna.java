package aulaClasseInterna;

public class ClasseExterna2_verifica_acesso_classeInterna {
	
	public static void main(String [] args){

		//ClasseInterna N�O EH acess�vel (independe usar private ou public aqui!)
		//ClasseInterna2 classeInterna = new ClasseInterna2();
		
		//ClasseInterna EH acess�vel (necess�rio public/protected aqui!)
		ClasseExterna2.ClasseInterna2 classeInterna = new ClasseExterna2().new ClasseInterna2();
		
		ClasseExterna1.ClasseInterna1 classeInterna1 = new ClasseExterna1().new ClasseInterna1();
		classeInterna1.getVar();
		
	}

}
