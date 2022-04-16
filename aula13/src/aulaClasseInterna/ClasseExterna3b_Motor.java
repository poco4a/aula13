package aulaClasseInterna;

public class ClasseExterna3b_Motor {

	private int pistao; //Nao acessivel nas classes static internas
	private int cambio; //Nao acessivel nas classes static internas
	
	private static class Pistao {
		private int pistao; //Minha variavel interna
		public Pistao(){ setPistao(0); }
		public void setPistao(int pistao){ this.pistao=pistao; }
	}//fim ClasseInterna
	
	private static class Cambio {
		private int cambio; //Minha variavel interna
		public Cambio(){ setCambio(4); }
		public void setCambio(int cambio){ this.cambio=cambio; }
	}//fim ClasseInterna	
	
	public static void main(String [] args){
		Pistao pistao = new Pistao();		
		Cambio cambio = new Cambio();		
	}//fim main
}//fim classe externa
