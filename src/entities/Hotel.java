package entities;

import javax.swing.JOptionPane;

public class Hotel {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		
		Funcionario funcionario = new Funcionario();

		String cargo = JOptionPane
				.showInputDialog("Digite o setor do funcionário (Manobrista / Atendente / Camareiro / Lavandeiro)")
				.toUpperCase();

		switch (cargo) {

			case "MANOBRISTA":
				Manobrista manobrista = new Manobrista();
				manobrista.setSetor(cargo);
				manobrista.inserirDados();
				int carros = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade de carros guardados: ")));
				manobrista.setCarrosGuardados(carros);
				manobrista.calcularPagamento(manobrista.getCarrosGuardados());
				manobrista.mostrarDados();
				break;
			case "ATENDENTE":
				Atendente atendente = new Atendente();
				atendente.setSetor(cargo);
				atendente.inserirDados();
				int quartos = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos alugados: ")));
				atendente.setQuartosAlugados(quartos);
				atendente.calcularPagamento(atendente.getQuartosAlugados());
				atendente.mostrarDados();
				break;
			case "CAMAREIRO":
				Camareira camareiro = new Camareira();
				camareiro.setSetor(cargo);
				camareiro.inserirDados();
				camareiro.setQuartosArrumados(
						(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos arrumados: "))));
				camareiro.calcularPagamento(camareiro.getQuartosArrumados());
				camareiro.mostrarDados();
				break;
			case "LAVANDEIRO":
				Lavandeiro lavandeiro = new Lavandeiro();
				lavandeiro.setSetor(cargo);
				lavandeiro.inserirDados();
				lavandeiro.setpecasDeRoupasLavadas(
						(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de roupas lavadas: "))));
				lavandeiro.calcularPagamento(lavandeiro.getpecasDeRoupasLavadas());
				lavandeiro.mostrarDados();
				break;
			default:
				JOptionPane.showConfirmDialog(null, "ERRO: Cargo inválido!");
				menu();
				break;
			}

	}

}
