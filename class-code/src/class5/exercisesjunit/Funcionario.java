// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.exercisesjunit;

import java.text.*;

public class Funcionario {
	private String primeiroNome;
	private String segundoNome;
	private String setor;
	private double salario;
	private Boolean ativo;
	
	public Funcionario(String primeiroNome, String segundoNome, String setor, double salario) {
		this.primeiroNome 	= primeiroNome;
		this.segundoNome 	= segundoNome;
		this.setor 			= setor;
		this.salario		= salario;
		this.ativo			= true;
	}
	
	public String nomeCompletoFormatado() {
		return this.primeiroNome + " " + this.segundoNome;
	}
	
	public String salarioFormatado() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		return "R$" + formatter.format(this.salario);
	}
	
	public void aumentarSalario(double aumento){
		if (aumento < 0) {
			return;
		} else {
			this.salario += aumento;
			return;
		}
	}
	
	public Boolean trocarDepartamento(String nomeDepartamento) {
		if (nomeDepartamento.length() != 3) {
			return false;
		} else {
			this.setor = nomeDepartamento;
			return true;
		}
	}
	
	public String departamentoFormatado() {
		return "Departamento " + this.setor;
	}
	
	public String informacoesFormatadas() {
		return this.nomeCompletoFormatado() + ", " + this.salarioFormatado() + ", " + this.departamentoFormatado();
	}
	
	public Boolean ativo() {
		return this.ativo;
	}
	
	public void demitirFuncionario() {
		this.ativo = false;
	}
}
