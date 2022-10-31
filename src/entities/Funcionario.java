package entities;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private int id;
	private String nome;
	private String setor;
	private double horasTrabalhadas;
	private double valorPorHora;
	private double horasNoturnas = 0;
	private double salario = 0;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double getHorasNoturnas() {
		return horasNoturnas;
	}
	
	public void setHorasNoturnas(double horasNoturnas) {
		this.horasNoturnas = horasNoturnas;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/*
	 * Método para calcular o pagamento de um funcionario.
	 * */
	public void calcularPagamento(double taxa) {
		
		// Calcular horas noturnas.
		double calcularValorNoturna = horasNoturnas * 20/100;
		
		//Calcular diferença entre horas normais e horas noturnas.
		double diferencaHoras = horasTrabalhadas - horasNoturnas;
		
		
		
		// Calcular o salario final.
		double calcularSalario = horasTrabalhadas * valorPorHora + calcularValorNoturna + taxa; 
		
		// Retorna o salario.
		this.salario = calcularSalario;
		
	}
	
	/*
	 * Método para inserir dados do funcionário.
	 * */
	public void inserirDados() {
		
		this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário: "));
		this.nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
		this.valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));
		this.horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de horas trabalhadas: "));
		this.horasNoturnas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de horas noturnas trabalhadas: "));
		
	}
	
	/* 
	 * Método para exibir os dados do funcionário.
	 */
	public void mostrarDados() {
		
		String mensagem = "Dados do funcionário";
		
		mensagem += "\nid: " + this.id;
		mensagem += "\nNome: " + this.nome;
		mensagem += "\nSetor: " + this.setor;
		
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance();
		
		mensagem += "\nSalario: " + dinheiro.format(getSalario());
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

	

}
