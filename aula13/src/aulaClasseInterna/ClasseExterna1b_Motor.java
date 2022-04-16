package aulaClasseInterna;

public class ClasseExterna1b_Motor {

	private int pistao;
	private int cambio;
	
	public class Pistao { //Classe Interna
		public Pistao(){ setPistao(0); }
		public void setPistao(int p){ pistao = p; }
	}//fim ClasseInterna
	
	public class Cambio { //Classe Interna				
		public Cambio(){ setCambio(4); }
		public void setCambio(int c){ cambio = c; }		
	}//fim ClasseInterna
	
	public static void main(String [] args){
		ClasseExterna1b_Motor.Pistao pistao = new ClasseExterna1b_Motor().new Pistao();
		ClasseExterna1b_Motor.Cambio cambio = new ClasseExterna1b_Motor().new Cambio();		
	}

}//fim classe externa
