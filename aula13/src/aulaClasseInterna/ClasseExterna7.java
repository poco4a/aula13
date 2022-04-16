package aulaClasseInterna;

public class ClasseExterna7 {
	
	public interface IMinhaClasse{
		public void imprimir();
	}
	
	public void metodo(){
				
		//IMinhaClasse var2 = new IMinhaClasse(); //Interface nao pode ser instanciada
		IMinhaClasse var = new IMinhaClasse(){ //Interface pode ser implementada
			public void imprimir(){
				System.out.println("Classe Anônima");
			}
		};
		var.imprimir();
	}//fim metodo
	
	
	public static void main(String [] args){
		ClasseExterna7 classeExterna = new ClasseExterna7();
		classeExterna.metodo();
			
	}

}
