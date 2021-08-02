package aulaGUI;

import javax.swing.JOptionPane;

public class GUI1 {	

	public static void main(String[] args) {
		
		String sn1 = JOptionPane.showInputDialog("Digite o numero1: ");
		String sn2 = JOptionPane.showInputDialog("Digite o numero2: ");
		
		float n1 = Float.parseFloat(sn1);
		float n2 = Float.parseFloat(sn2);
		
		float n3 = n1 + n2;
		JOptionPane.showMessageDialog(null, 
				"A soma eh: " + n3, 
				"Titulo", JOptionPane.PLAIN_MESSAGE); 
		//ERROR_MESSAGE, 
		//INFORMATION_MESSAGE
		//WARNING_MESSAGE
		//QUESTION_MESSAGE
		//PLAIN_MESSAGE		

	}

}
