package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.println("Dolar--" + valor);

	}

	public double converter() {
		return valor * 4.9;

	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Dolar objDolar = (Dolar) obj;

		if (this.valor != objDolar.valor) {
			return false;
		}

		return true;

	}

}
