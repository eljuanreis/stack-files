package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {

	public int fatorial (int valor) {
		Pilha p = new Pilha();
		
		for (int i = 1; i <= valor; i++) {
			p.push(i);
		}

		int result = 1; 
		
		while (!p.isEmpty()) {
			try {
				result = result * (p.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
