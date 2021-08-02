package aulaGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI2 extends JFrame {	

	private final JLabel l1;	
	
	public GUI2(){
		
		super("JLabel Exemplo");
		
		l1 = new JLabel("Rotulo 1");
		l1.setToolTipText("Mensagem de dica");
		add(l1);
		
	}
	
	public static void main(String[] args) {
			
		GUI2 gui = new GUI2();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(240,460);
		gui.setVisible(true);
		
	}//fim main

}//fim classe
