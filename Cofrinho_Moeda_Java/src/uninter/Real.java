package uninter;

public class Real extends Moeda {// Real filha de Moeda

	public Real(double valor) {// construtor para Real
		this.valor = valor;
	}

// metodo info vai mostra o tipo da moeda e o valor
	public void info() {
		System.out.println("Real--" + valor);

	}

// metodo converter, converte valor da moeda para real
	public double converter() {
		return valor;
	}

	@Override // sobrescrevendo metodo object
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {// se o objeto for de clase diferente retorna falso
			return false;
		}

		Real objReal = (Real) obj;

		if (this.valor != objReal.valor) {// se o objeto for valor diferente de real retorna falso
			return false;
		}

		return true;// se nao retorna verdadeiro

	}

}
