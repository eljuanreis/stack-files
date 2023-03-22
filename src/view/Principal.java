package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		int number = -1;
		
		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0-10"));
			
			FatController f = new FatController();
			int fat = f.fatorial(number);
			
			System.out.println(fat);
		} while((number < 0 && number > 10));
	}

}
