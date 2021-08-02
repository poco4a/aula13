package aulaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GUI3 extends JFrame {

	private int var;
	
	private JButton botao;
	
	public GUI3() {
	
		super("Classe Interna Anonima");
		setLayout(new FlowLayout());     //Classe Interna Anonima
		
		ClasseInterna manipulador = new ClasseInterna();
				
		botao = new JButton("Classe Interna Anonima");
		add(botao);		
		//botao.addActionListener( manipulador );
		botao.addActionListener( new ActionListener(){ //Classe Interna Anonima
			
			//Classe interna anonima TEM acesso aos membros da classe superior de primeiro nivel
			public void actionPerformed(ActionEvent e){
				var=1;
				System.out.println(var);
				
				//JOptionPane.showMessageDialog(ClasseExterna5_comAnonima.this, 
				//		String.format("Você pressionou %s", e.getActionCommand()));
			}			
		});
		
	}
	
	private class ClasseInterna implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			
			JOptionPane.showMessageDialog(GUI3.this, 
					String.format("Você pressionou %s", e.getActionCommand()));
			
		}
	}//fim classe
	
	public static void main(String [] args){
		GUI3 gui = new GUI3();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(240,460);
		gui.setVisible(true);
	}
	
	
	

}
