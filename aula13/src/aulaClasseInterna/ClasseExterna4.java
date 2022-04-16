package aulaClasseInterna;

public class ClasseExterna4 {

	private int var;
	
	private void incremento(){
		var++;
	}
	
	private class ClasseInterna4 {
		private int interno;
		
		private ClasseInterna4(){
			interno++;
		}
	}//fim classe
	
	//static: a ClasseInterna eh visivel apenas dentro da ClasseExterna
	private static class ClasseInternaStatic {
		private int interno_protegido;
		
		private ClasseInternaStatic(){
			interno_protegido++;  //OK
			//interno++;          //static: N�O TEM acesso imediato aos membros de outras classes
			                      //        N�O TEM refer�ncia para membros da classe externa
		}
		
	}//fim classe

}//fim classe
