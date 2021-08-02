package aulaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI4 extends JFrame{

	private JTextField campoTexto;
	private JPasswordField campoSenha;
	
	public GUI4() {
		
		super("JTextField e JPasswordField");
		setLayout(new FlowLayout());
		
		campoTexto = new JTextField(10); //10 colunas
		add(campoTexto);
		
		campoSenha = new JPasswordField("Texto oculto");
		add(campoSenha);
		
		campoTexto.addActionListener(new ActionListener(){
			//private String string;
			public void actionPerformed(ActionEvent e){
				String string = String.format("Campo texto: " + e.getActionCommand());
				JOptionPane.showMessageDialog(null,string);
			}
		});
		
		campoSenha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String string = String.format("Campo senha: " + e.getActionCommand());
				JOptionPane.showMessageDialog(null,string);
			}
			
		});
		
	}

	public static void main(String[] args) {
		GUI4 gui = new GUI4();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(240,460);
		gui.setVisible(true);

	}

}
