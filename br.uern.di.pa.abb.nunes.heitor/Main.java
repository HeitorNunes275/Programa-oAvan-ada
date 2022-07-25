package br.uern.di.pa.abb.nunes.heitor;

public class Main {

	public static void main(String[] args) {
		Currupio c1 = new Currupio(10);
		Papagaio p1 = new Papagaio(9);

		c1.cantar();
		p1.cantar();
		
		System.out.println(c1.voar(15));
		System.out.println(p1.voar(30));
		
	}

}
