package entities;

//Classe Motorista
public class Manobrista extends Funcionario {
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
		
		//Atribuindo um bonus pela quantidade de carros guardados.
		double calculo = getHorasTrabalhadas() * (this.carrosGuardados * 0.08);
		
		//adicionando o bonus para o salário do manobrista
		super.calcularPagamento(calculo);
		
	}
	
	
}
