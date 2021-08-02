package aulaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI5 extends JFrame{

	private JTextField campoTexto;
	private JCheckBox checkboxNegrito, checkboxItalico;
	
	public GUI5() {
		
		super("JCheckBox");
		setLayout(new FlowLayout());
		
		campoTexto = new JTextField("Mudança da fonte aqui", 10); //10 colunas
		campoTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 
		add(campoTexto);
		
		checkboxNegrito = new JCheckBox("Negrito");
		checkboxItalico = new JCheckBox("Italico");
		add(checkboxNegrito);
		add(checkboxItalico);
		
		checkboxNegrito.addItemListener(new ItemListener(){ //Exige o import	
			Font fonte = null;  //Exige o import
			public void itemStateChanged(ItemEvent arg0) {
				if ( checkboxNegrito.isSelected())
					fonte = new Font("Arial", Font.BOLD, 12);
				else
					fonte = new Font("Arial", Font.PLAIN, 12);
				
				campoTexto.setFont(fonte);				
			}});		
		
		ClasseListener listener = new ClasseListener(); //Vamos utilizar uma classe interna
		checkboxItalico.addItemListener(listener);
		
	}
	
	private class ClasseListener implements ItemListener {  //private: nao queremos acesso fora dessa classe

		Font fonte = null;  //Exige o import
		public void itemStateChanged(ItemEvent arg0) {
			if ( checkboxItalico.isSelected())
				fonte = new Font("Arial", Font.ITALIC, 12);
			else
				fonte = new Font("Arial", Font.PLAIN, 12);
			
			campoTexto.setFont(fonte);
		}//fim metodo
	}//fim classe interna

	public static void main(String[] args) {
		GUI5 gui = new GUI5();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);

	}

}
