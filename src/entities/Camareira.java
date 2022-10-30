package entities;

public class Camareira extends Funcionario {
	
	private int quartosArrumados;
	
	public int getQuartosArrumados() {
		return quartosArrumados;
	}

	public void setQuartosArrumados(int quartosArrumados) {
		this.quartosArrumados = quartosArrumados;
	}

	@Override
	public double calcularPagamento() {
		double salario = super.calcularPagamento();
		return salario = salario +(salario *(quartosArrumados * 0.5)/10);
	}
	
}
