package entities;

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
	public double calcularPagamento() {
		//Pegando o valor original que vem da classe funcionário
		double salario = super.calcularPagamento();
		//adicionando mais 5% para o salário do manobrista
		return salario = salario + (0.05 * salario);
	}
	
	
}
