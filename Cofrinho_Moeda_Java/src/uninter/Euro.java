package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.println("Euro--" + valor);
	}

	public double converter() {
		return this.valor * 5.3;

	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Euro objEuro = (Euro) obj;

		if (this.valor != objEuro.valor) {
			return false;
		}

		return true;

	}

}