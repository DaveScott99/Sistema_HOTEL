
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
		
		//Pegando o valor original que vem da classe funcionário
		double calculo = getHorasTrabalhadas() * (this.quartosAlugados * 0.08);
		
		//adicionando mais 8% para o salário do manobrista
		super.calcularPagamento(calculo);
		
	}
	
}
