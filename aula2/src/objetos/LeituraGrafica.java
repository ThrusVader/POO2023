package objetos;

import javax.swing.JOptionPane;

public class LeituraGrafica {

	public static void main(String[] args) {
		String	nota1 =	JOptionPane.showInputDialog("Digite a primeira nota:");
		String	nota2 =	JOptionPane.showInputDialog("Digite a segunda nota:");
		double	n1 = Double.parseDouble(nota1); // Converte uma string para double ou cadeia para real
		double	n2 = Double.parseDouble(nota2);
		JOptionPane.showMessageDialog(null, (n1+n2)/2 ); // Mostra uma tela com a menssagem da String
	}

}
