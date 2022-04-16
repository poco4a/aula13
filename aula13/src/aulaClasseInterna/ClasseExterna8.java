package aulaClasseInterna;

public class ClasseExterna8 {
	
	public abstract class MinhaClasse{
		public abstract void imprimir();		
	}
	
	public void metodo(){
			
		//MinhaClasse var2 = new MinhaClasse(); //Classe abstract nao pode ser instanciada
		MinhaClasse var = new MinhaClasse() { //Classe abstract pode ser implementada
			public void imprimir(){
				System.out.println("Classe Anônima");
			}
		};
		var.imprimir();
	}//fim metodo
	
	
	public static void main(String [] args){
		ClasseExterna8 classeExterna = new ClasseExterna8();
		classeExterna.metodo();
			
	}

}
