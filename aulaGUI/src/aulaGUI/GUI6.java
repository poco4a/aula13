package aulaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI6 extends JFrame{

	private JTextField campoTexto;
	private JRadioButton botaoNegrito, botaoItalico;
	private ButtonGroup grupo;
	
	public GUI6() {
		
		super("JRadioButton");
		setLayout(new FlowLayout());
		
		campoTexto = new JTextField("Mudança da fonte aqui", 10); //10 colunas
		campoTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 
		add(campoTexto);
		
		botaoNegrito = new JRadioButton("Negrito");
		botaoItalico = new JRadioButton("Italico");
		add(botaoNegrito);
		add(botaoItalico);
		
		//Cria o relacionamento entre os JRadioButton
		grupo = new ButtonGroup();
		grupo.add(botaoNegrito);
		grupo.add(botaoItalico);
		
		
		botaoNegrito.addItemListener(new ItemListener(){ //Exige o import	
			Font fonte = null;  //Exige o import
			public void itemStateChanged(ItemEvent arg0) {
				if ( botaoNegrito.isSelected())
					fonte = new Font("Arial", Font.BOLD, 12);
				else
					fonte = new Font("Arial", Font.PLAIN, 12);
				
				campoTexto.setFont(fonte);				
			}});		
		
		ClasseListener listener = new ClasseListener(); //Vamos utilizar uma classe interna
		botaoItalico.addItemListener(listener);
		
	}
	
	private class ClasseListener implements ItemListener {  //private: nao queremos acesso fora dessa classe

		Font fonte = null;  //Exige o import
		public void itemStateChanged(ItemEvent arg0) {
			if ( botaoItalico.isSelected())
				fonte = new Font("Arial", Font.ITALIC, 12);
			else
				fonte = new Font("Arial", Font.PLAIN, 12);
			
			campoTexto.setFont(fonte);
		}//fim metodo
	}//fim classe interna

	public static void main(String[] args) {
		GUI6 gui = new GUI6();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);

	}

}
