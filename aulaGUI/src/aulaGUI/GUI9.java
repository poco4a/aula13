package aulaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI9 extends JFrame { //Frame processa os eventos do teclado

	private JTextArea areaTexto;
	private JTextField campoTexto;
	
	public GUI9() {
		
		super("KeyListener");
		setLayout(new FlowLayout());
				
		areaTexto = new JTextArea(10,20); //Linhas, colunas
		areaTexto.setText("Pressione uma tecla: ");
		areaTexto.setEnabled(false);
		//add(areaTexto);
		add(new JScrollPane(areaTexto));
		
		//Classe anônima adapter: nao eh necessario declarar todos os métodos da interface
		addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				String tecla = KeyEvent.getKeyText(arg0.getKeyCode()); //Tecla pressionada
				areaTexto.append("\nKeyCode: " + tecla);				
			}
			
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				String tecla = arg0.getKeyChar()+"";
				areaTexto.append("\nTecla: "+tecla);				
			}
		});

		/*addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				String tecla = KeyEvent.getKeyText(arg0.getKeyCode()); //Tecla pressionada
				areaTexto.append("\nKeyCode: " + tecla);				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				String tecla = arg0.getKeyChar()+"";
				areaTexto.append("\nTecla: "+tecla);				
			}
			
		});
		*/
				
		//ClasseListener listener = new ClasseListener(); //Vamos utilizar uma classe interna		
		
	}
	
	/*private class ClasseListener implements ItemListener {  //private: nao queremos acesso fora dessa classe

		public void itemStateChanged(ItemEvent item) {
			//Indica se o item foi selecionado 
			if ( item.getStateChange() == ItemEvent.SELECTED)
				campoTexto.setText(item.getItem().toString());
						
		}//fim metodo		
		
	}//fim classe interna*/

	public static void main(String[] args) {
		GUI9 gui = new GUI9();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);

	}

}
