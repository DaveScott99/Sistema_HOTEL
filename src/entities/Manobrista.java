package entities;

import javax.swing.JOptionPane;

//Classe Motorista
public class Manobrista extends Funcionario{
	//Criação do atributo
	private int carrosGuardados;

	//GET e SET - Métodos Acessores
	public int getCarrosGuardados() {
		return carrosGuardados;
	}

	public void setCarrosGuardados(int carrosGuardados) {
		this.carrosGuardados = carrosGuardados;
	}

	//Método de calcular pagamento com override
	@Override
	public void calcularPagamento(double carrosGuardados) {
		
		//Pegando o valor original que vem da classe funcionário
		double calculo = getHorasTrabalhadas() * (this.carrosGuardados * 0.08);
		
		//adicionando mais 8% para o salário do manobrista
		super.calcularPagamento(calculo);
		
	}
	
	
}
