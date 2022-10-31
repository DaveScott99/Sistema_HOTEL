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
	
	@Override
	public double calcularPagamento() {
		//Pega o valor calculado
		double salario = super.calcularPagamento();
		
		//Adicionando a porcentagem para cada quarto alugado
		return salario = salario + (salario * (quartosAlugados * 0.08) / 10);
	}
	
}
