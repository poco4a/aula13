package aulaClasseInterna;

public class ClasseExterna6 {
	
	interface IMinhaClasse{
		public void imprimir();
	}
	
	public void metodo(){
		
		//Classe local: declarada dentro do metodo
		class MinhaClasse implements IMinhaClasse{
			public void imprimir(){
				System.out.println("MinhaClasse");
			}
		}//fim classe
		IMinhaClasse var = new MinhaClasse();
		
	}//fim metodo
	
	
	public static void main(String [] args){
		ClasseExterna6 classeExterna = new ClasseExterna6();
			
	}

}
