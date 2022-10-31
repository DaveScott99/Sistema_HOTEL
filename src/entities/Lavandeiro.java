package entities;

public class Lavandeiro extends Funcionario {
	
	private int pecasDeRoupasLavadas;
	
	public int getpecasDeRoupasLavadas() {
		
		return pecasDeRoupasLavadas;
	}
	
	public void setpecasDeRoupasLavadas(int pecasDeRoupasLavadas) {
		
		this.pecasDeRoupasLavadas = pecasDeRoupasLavadas;
	}
	
	@Override
	public double calcularPagamento() {
		
		double salarioLavandeiro = super.calcularPagamento();
		
		return salarioLavandeiro = salarioLavandeiro+(salarioLavandeiro*(pecasDeRoupasLavadas * 0.05)/10);
	}

}
