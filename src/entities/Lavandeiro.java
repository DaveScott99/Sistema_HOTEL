
package entities;

public class Lavandeiro extends Funcionario {
	
	private int pecasDeRoupasLavadas;
	
	public int getpecasDeRoupasLavadas() {
		
		return pecasDeRoupasLavadas;
	}
	
	public void setpecasDeRoupasLavadas(int pecasDeRoupasLavadas) {
		
		this.pecasDeRoupasLavadas = pecasDeRoupasLavadas;
	}
	
	//Método de calcular pagamento com override
		@Override
		public void calcularPagamento(double carrosGuardados) {
			
			//Pegando o valor original que vem da classe funcionário
			double calculo = getHorasTrabalhadas() * (this.pecasDeRoupasLavadas * 0.10);
			
			//adicionando mais 10% para o salário do manobrista
			super.calcularPagamento(calculo);
			
		}

}