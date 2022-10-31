
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
			
			//Atribuindo um bonus pela quantidade de roupas lavadas.
			double calculo = getHorasTrabalhadas() * (this.pecasDeRoupasLavadas * 0.10);
			
			//adicionando o bonus para o salário do lavandeiro
			super.calcularPagamento(calculo);
			
		}

}