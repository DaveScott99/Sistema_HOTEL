package entities;

import javax.swing.JOptionPane;

public class Hotel {
	
	// Pergunta qual instancia será criada de um funcionário
	static String cargo = JOptionPane.showInputDialog("Digite o setor do funcionário (Manobrista / Atendente / Camareiro / Lavandeiro)").toUpperCase();
	
	// Método principal
	public static void main(String[] args) {
		
		// Cria uma instacia de acordo com o setor do funcionário.
		switch (cargo) {

			case "MANOBRISTA":
				cadastroManobrista();
				break;
			case "ATENDENTE":
				cadastroAtendente();
				break;
			case "CAMAREIRO":
				cadastroCamareiro();
				break;
			case "LAVANDEIRO":
				cadastroLavandeiro();
				break;
			default:
				JOptionPane.showConfirmDialog(null, "ERRO: Cargo inválido!");
				break;
				
		}

	}

	// Cria uma instancia do Funcionario Manobrista
	public static void cadastroManobrista() {
		Manobrista manobrista = new Manobrista();
		manobrista.setSetor(cargo);
		manobrista.inserirDados();
		manobrista.setCarrosGuardados(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de carros guardados: ")));
		manobrista.calcularPagamento(manobrista.getCarrosGuardados());
		manobrista.mostrarDados();
	}
	
	// Cria uma instancia do Funcionario Atendente
	public static void cadastroAtendente() {
		Atendente atendente = new Atendente();
		atendente.setSetor(cargo);
		atendente.inserirDados();
		atendente.setQuartosAlugados((Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos alugados: "))));
		atendente.calcularPagamento(atendente.getQuartosAlugados());
		atendente.mostrarDados();
	}
	
	// Cria uma instancia do Funcionario Camareiro
	public static void cadastroCamareiro() {
		Camareira camareiro = new Camareira();
		camareiro.setSetor(cargo);
		camareiro.inserirDados();
		camareiro.setQuartosArrumados((Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos arrumados: "))));
		camareiro.calcularPagamento(camareiro.getQuartosArrumados());
		camareiro.mostrarDados();
	}
	
	// Cria uma instancia do Funcionario Lavandeiro
	public static void cadastroLavandeiro() {
		Lavandeiro lavandeiro = new Lavandeiro();
		lavandeiro.setSetor(cargo);
		lavandeiro.inserirDados();
		lavandeiro.setpecasDeRoupasLavadas((Integer.parseInt(JOptionPane.showInputDialog("Quantidade de roupas lavadas: "))));
		lavandeiro.calcularPagamento(lavandeiro.getPecasDeRoupasLavadas());
		lavandeiro.mostrarDados();
	}


}
