
package entities;

public class Camareira extends Funcionario {
	
	private int quartosArrumados;
	
	public int getQuartosArrumados() {
		return quartosArrumados;
	}

	public void setQuartosArrumados(int quartosArrumados) {
		this.quartosArrumados = quartosArrumados;
	}

	//Método de calcular pagamento com override
		@Override
		public void calcularPagamento(double carrosGuardados) {
			
			//Atribuindo um bonus pela quantidade de quartos arrumados.
			double calculo = getHorasTrabalhadas() * (this.quartosArrumados * 0.05);
			
			//adicionando o bonus para o salário do camareiro
			super.calcularPagamento(calculo);
			
		}
	
}
