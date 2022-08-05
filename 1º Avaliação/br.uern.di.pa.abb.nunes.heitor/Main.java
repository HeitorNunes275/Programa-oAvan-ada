package br.uern.di.pa.abb.nunes.heitor;

public class Main {

	public static void main(String[] args) {
		Passaro c1 = new Currupio(10);
		Passaro p1 = new Papagaio(9);

		c1.cantar();
		p1.cantar();
		
		System.out.println(c1.voar(15));
		System.out.println(p1.voar(30));
		
	}

}
