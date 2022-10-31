
package entities;

public class Atendente extends Funcionario {
	private int quartosAlugados;

	public int getQuartosAlugados() {
		return quartosAlugados;
	}

	public void setQuartosAlugados(int quartosAlugados) {
		this.quartosAlugados = quartosAlugados;
	}
	
	
	//Método com Override
	
	//Método de calcular pagamento com override
	@Override
	public void calcularPagamento(double carrosGuardados) {
		
		//Atribuindo um bonus pela quantidade de quartos alugados.
		double calculo = getHorasTrabalhadas() * (this.quartosAlugados * 0.08);
		
		//adicionando o bonus para o salário do atendente
		super.calcularPagamento(calculo);
		
	}
	
}
