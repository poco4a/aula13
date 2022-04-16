package aulaClasseInterna;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClasseExterna5_comAnonima extends JFrame {

	private int var;
	
	private JButton botao;
	
	public ClasseExterna5_comAnonima() {
	
		super("Classe Interna Anonima");
		setLayout(new FlowLayout());     //Instanciacao de um objeto FlowLayout
		
		ClasseInterna manipulador = new ClasseInterna();
				
		botao = new JButton("Classe Interna Anonima");
		add(botao);		
		//botao.addActionListener( manipulador ); //Chamada com Classe Interna com nome 
		botao.addActionListener( new ActionListener(){ 
			//Chamada com classe interna sem nome (anonima)
            //implementa a interface ActionListener
			public void actionPerformed(ActionEvent e){
				var=1;
				System.out.println(var);				
				JOptionPane.showMessageDialog(ClasseExterna5_comAnonima.this, 
						String.format("Você pressionou %s", e.getActionCommand()));
			}//fim metodo			
		});
	}//fim classe
	
	//ClasseInterna com nome
	private class ClasseInterna implements ActionListener {		
		public void actionPerformed(ActionEvent e){			
			JOptionPane.showMessageDialog(ClasseExterna5_comAnonima.this, 
					String.format("Você pressionou %s", e.getActionCommand()));		
		}
	}//fim classe
	
	public static void main(String [] args){
		ClasseExterna5_comAnonima gui = new ClasseExterna5_comAnonima();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(240,460);
		gui.setVisible(true);
	}
}
