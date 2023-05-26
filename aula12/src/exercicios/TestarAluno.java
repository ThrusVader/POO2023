package exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestarAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double nota1, nota2;
		int confirmar=0;
		Aluno aluno;
		List<Aluno> alunos = new ArrayList<>();

		do {
			try {
				nome = JOptionPane.showInputDialog("Nome:");
				nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota nº1:"));
				nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota nº2:"));
				aluno = new Aluno(nome, nota1, nota2);
				alunos.add(aluno);
				JOptionPane.showMessageDialog(null ,aluno.calcularMedia(nome));
				confirmar = JOptionPane.showInternalConfirmDialog(null, "Deseja continuar", "Continuar", 0);
			} catch (AlunoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você digitou o caracter inválido");
			}
		} while (confirmar == 0);
	}
}
