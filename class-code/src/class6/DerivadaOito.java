package class6;

class BaseOito {
	public void metodoUm() {
		System.out.println("Método um da Base Oito");
		metodoDois();
	}
	public void metodoDois() {
		System.out.println("Método dois da Base Oito");
	}
}

public class DerivadaOito extends BaseOito{
	public static void main(String[] args) {
		DerivadaOito dr8 = new DerivadaOito();
		BaseOito bs8 = new BaseOito();
		bs8.metodoUm();
	}
	
	public void metodoDois() {
		System.out.println("Método dois da Derivada Oito");
	}
}
