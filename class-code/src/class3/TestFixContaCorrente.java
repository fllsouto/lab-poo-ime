package class3;

import class3.FixContaCorrente;

public class TestFixContaCorrente {
	
	public static void main(String[] args) {
		if(testFixContaCorrente()) {
			System.out.println("All test passed");
		} else {
			System.out.println("Some test not passed");
		}
	}
	
	public static Boolean testFixContaCorrente() {
		String nameCase;
		int nContaCase;
		double balanceCase;
		
		Boolean testFlag = true;
		
		nameCase = "Fellipe Souto";
		nContaCase = 123123123;
		balanceCase = 10000.0;
		FixContaCorrente contaCase1 = new FixContaCorrente(nameCase, nContaCase, balanceCase);
		if(contaCase1.getNome() == nameCase && contaCase1.nconta() == nContaCase && contaCase1.saldo() == balanceCase) {
			System.out.println("Case #1 passed");
			contaCase1.imprime();
		} else {
			System.out.println("Case #1 not passed");
			contaCase1.imprime();
			testFlag = false;
		}

		nameCase = "Maria da Silva";
		nContaCase = 777777777;
		balanceCase = 2050.0;
		FixContaCorrente contaCase2 = new FixContaCorrente(nameCase, nContaCase);
		if(contaCase2.getNome() == nameCase && contaCase2.nconta() == nContaCase && contaCase2.saldo() != balanceCase && contaCase2.saldo() == 0) {
			System.out.println("Case #2 passed");
			contaCase2.imprime();
		} else {
			System.out.println("Case #2 not passed");
			contaCase2.imprime();
			testFlag = false;
		}
		
		nameCase = "João Paulo";
		nContaCase = 111122223;
		balanceCase = 20.0;
		FixContaCorrente contaCase3 = new FixContaCorrente(nameCase, nContaCase, balanceCase);
		if(contaCase3.getNome() == nameCase && contaCase3.nconta() == nContaCase && contaCase3.saldo() == balanceCase) {
			System.out.println("Case #3 passed");
			contaCase3.imprime();
		} else {
			System.out.println("Case #3 not passed");
			contaCase3.imprime();
			testFlag = false;
		}
		
		if(contaCase1.getBankName() == contaCase2.getBankName() && contaCase2.getBankName() == contaCase3.getBankName()) {
			System.out.println("Case Bank name passed, it's '" + contaCase2.getBankName() + "'");
			contaCase1.imprime();
		} else {
			System.out.println("Case Bank name not passed");
			contaCase3.imprime();
			testFlag = false;
		}

		return testFlag;
	}
}
