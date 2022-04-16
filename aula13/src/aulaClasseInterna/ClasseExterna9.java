package aulaClasseInterna;

public class ClasseExterna9 {
	
	public class MinhaClasse{
		public void imprimir(){
			System.out.println("Minha Classe");
		}
	}
	
	public void metodo(){
			
		MinhaClasse var = new MinhaClasse() { //Classe que serah derivada
			public void imprimir(){
				System.out.println("Classe Anônima");
			}			
		};
		var.imprimir();
		
	}//fim metodo
	
	public static void main(String [] args){
		ClasseExterna9 classeExterna = new ClasseExterna9();
		classeExterna.metodo();
			
	}

}
