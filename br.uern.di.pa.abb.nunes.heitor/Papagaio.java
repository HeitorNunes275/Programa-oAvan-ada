package br.uern.di.pa.abb.nunes.heitor;

public class Papagaio extends Passaro {
	
	private int dMax;
	
	public int getdMax() {
		return dMax;
	}

	public void setdMax(int dMax) {
		this.dMax = dMax;
	}

	public Papagaio(int max) {
		this.dMax = max;
	}
	
	public void cantar() {
		System.out.println("Papagaio legal");
	}
	
	public int voar(int n) {
		if (n > dMax) {
			return dMax;
		} else {
			return n;
		}
	}
	
	
}
