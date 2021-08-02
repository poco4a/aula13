package aulaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI7 extends JFrame{

	private JComboBox<String> lista;
	private String [] items = { "1", "2", "3", "4", "5" };
	private JTextField campoTexto;
	
	public GUI7() {
		
		super("JComboBox");
		setLayout(new FlowLayout());
				
		lista = new JComboBox<String>(items);
		lista.setMaximumRowCount(3);
		add(lista);
		
		campoTexto = new JTextField("Mudança da fonte aqui", 10); //10 colunas
		campoTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 
		add(campoTexto);
		
		lista.addItemListener(new ItemListener(){ //Exige o import	
			
			public void itemStateChanged(ItemEvent item) {
				//Indica se o item foi selecionado 
				if ( item.getStateChange() == ItemEvent.SELECTED)
					campoTexto.setText(item.getItem().toString());
							
			}});		
		
		ClasseListener listener = new ClasseListener(); //Vamos utilizar uma classe interna		
		
	}
	
	private class ClasseListener implements ItemListener {  //private: nao queremos acesso fora dessa classe

		public void itemStateChanged(ItemEvent item) {
			//Indica se o item foi selecionado 
			if ( item.getStateChange() == ItemEvent.SELECTED)
				campoTexto.setText(item.getItem().toString());
						
		}//fim metodo		
		
	}//fim classe interna

	public static void main(String[] args) {
		GUI7 gui = new GUI7();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);

	}

}
