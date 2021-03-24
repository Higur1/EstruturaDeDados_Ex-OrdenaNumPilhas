package ordena;

import javax.swing.JOptionPane;

public class Numero {
	public Object [] pilha;
	public int elementos;
	public double maior;

	
	public Numero() {
		this.elementos = -1;
		this.pilha = new Object [5];
	}
	
	public boolean estaVazia() {
		if(elementos == -1) {
			return true;
		}
		return false;
	}
	
	public Object pop() {
		if (estaVazia()) {
			return null;
		}
		return pilha[elementos--];
	}
	public void push(double objeto) {
		if(elementos < pilha.length -1) {
			pilha[++elementos] = objeto;
		}
	}
	public void mostrar() {
        String printar = "";
        for (int c = 0; c <= elementos; c++) {
            printar += pilha[c] + "  ";
        }
        JOptionPane.showMessageDialog(null,printar);
	}
	public void verifica(Object objeto) {
		double aux;
		boolean vdd = true;
		
		if(estaVazia()) {
			pilha[++elementos] = objeto;
			maior = (double) objeto;
		}
		else{
			while(vdd) {
				for(int c = 0 ; c < pilha.length ; c++) {
					if(pilha[c] != null) {
						if (((double)objeto >= (double)pilha[c]) && ((double) objeto >= maior)) {
							pilha[++elementos] = (double)objeto;
							maior = (double)objeto;
							c = pilha.length;
						}
						else {
							if((double)objeto < (double)pilha[c]){
								aux = (double)pilha[c];
								pilha[c] = objeto;
								objeto = aux;
							}
						}
						if (c == pilha.length) {
							vdd= false;
						}
					}
				}
			}
		}	
	}	
}


