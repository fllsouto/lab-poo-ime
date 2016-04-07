package class3;

public class FixContaCorrente {
	
	private String nome;
	private int nconta;
	private double saldo;
	public static String nomeBanco = "Dharma Finances LTDA.";
	
	public FixContaCorrente(String nome, int nconta, double saldo) {
		this.nome = nome;
		this.nconta = nconta;
		this.saldo = saldo;
	}
	
	public FixContaCorrente(String nome, int nconta) {
		this.nome = nome;
		this.nconta = nconta;
		this.saldo = 0;
	}
	
	public String getBankName() {
		return FixContaCorrente.nomeBanco;
	}
	
	public void setNome(String n){
		nome = n;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double saldo() {
		return this.saldo;
	}
	
	public int nconta() {
		return this.nconta;
	}
	
	public void imprime() {
		System.out.println("Client account name : " + this.getNome());
		System.out.println("Client account number : " + this.nconta);
		System.out.println("Client account balance : " + this.saldo);
		System.out.println("Client account bank : " + this.getBankName());
		System.out.println("");
	}
}
