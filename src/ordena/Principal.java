package ordena;


import ordena.Numero;

public class Principal {

	public static void main(String[] args) {
		
		
		Numero p = new Numero();
		Numero p2 = new Numero();
		
		p.push(5);
		p.push(1.1);
		p.push(-2);
		p.push(3);
		p.push(-1.2);

		
		while(!(p.estaVazia())) {
			p2.verifica(p.pop());
		}
		while(!(p2.estaVazia())) {
			p.verifica(p2.pop());
		}
		p.mostrar();
	}

}
