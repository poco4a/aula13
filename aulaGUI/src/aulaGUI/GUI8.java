package aulaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI8 extends JFrame{

	private JList<String> lista;
	private String [] items = { "1", "2", "3", "4", "5" };
	private JTextField campoTexto;
	
	public GUI8() {
		
		super("JList");
		setLayout(new FlowLayout());
				
		lista = new JList<String>(items);
		lista.setVisibleRowCount(3);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //Selecao multipla de itens
		
		//Adiciona uma barra de rolagem ah lista
		add(new JScrollPane(lista));
		
		
		campoTexto = new JTextField("Mudança da fonte aqui", 10); //10 colunas
		campoTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 
		add(campoTexto);
		
		lista.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				campoTexto.setText(lista.getSelectedValue()); //1 item
				//campoTexto.setText(lista.getSelectedValuesList()+""); //Multiplos itens
				
			} //Exige o import	
			
		});
		
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
		GUI8 gui = new GUI8();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);

	}

}
