
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
			
			//Pegando o valor original que vem da classe funcionário
			double calculo = getHorasTrabalhadas() * (this.quartosArrumados * 0.05);
			
			//adicionando mais 5% para o salário do manobrista
			super.calcularPagamento(calculo);
			
		}
	
}
