// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 4 - 03/10/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class4;

public class Client {
	private String name;
	private int accNumber;
	private Boolean accBlocked;
	private double balance;
	
	private static int accNumberBase = 1000;
	private static int blockedAccCounter = 0;
	private static int clientCounter = 0;
	private static final int MAX_CLIENT = 5;
	
	public static Client getNewClient(String name, double balance) {
		if(clientCounter < MAX_CLIENT) {
			Client client = new Client(name, balance);
			clientCounter++;
			return client;
		}
		return null;
	}
	
	public static Client getNewClient(String name) {
		if(clientCounter < MAX_CLIENT) {
			Client client = new Client(name);
			return client;
		}
		return null;
	}

	
	private Client(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accNumber = getNewAccNumber();
		this.accBlocked = false;
	}
	
	public Boolean finalizeClientAcc() {
		try {
			this.finalize();
			return true;
		} catch(Throwable t) {
			return false;
		}
	}
	
	@Override
	protected void finalize() throws Throwable{
		try {
			super.finalize();
			clientCounter--;
		} catch(Throwable t) {
			throw t;
		}
	}
	
	private Client(String name) {
		this(name, 0);
	}
	
	private int getNewAccNumber() {
		return ++accNumberBase;
	}
	
	public static int getAccNumberBase() {
		return accNumberBase;
	}
	
	public static int blockedAcc() {
		return blockedAccCounter;
	}
	
	public static int getClientCounter() {
		return clientCounter;
	}
	
	public static void resetStaticVars() {
		Client.clientCounter = 0;
		Client.accNumberBase = 1000;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccNumber() {
		return this.accNumber;
	}
	
//	public Boolean cashWithdrawal(double amount) {
//		if(this.getBalance() > amount && amount > 0) {
//			this.updateBalance((-1) * amount);
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public Boolean cashWithdrawal(double amount) {
		if(amount > 0) {
			this.updateBalance((-1) * amount);
			if(this.getBalance() < amount) {
				this.accBlocked = true;
				blockedAccCounter++;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean cashDeposit(double amount) {
		if(amount > 0) {
			if(this.getBalance() < 0) {
				blockedAccCounter--;
				this.accBlocked = false;
			}
			
			this.updateBalance(amount);
			return true;
		} else {
			return false;
		}
	}
	
	private void updateBalance(double amount) {
		this.balance += amount;
	}
	
	public String getAccDetails() {
		return "Name: " +  this.getName() + "\nBalance: " + this.getBalance() + "\nAccount Number: " + this.getAccNumber();
	}
	
	public Boolean haveCash(double amount) {
		return (this.getBalance() > amount);
	}
	
	public Boolean haveSameName(String name) {
		return (this.getName() == name);
	}
	
	public Boolean accBlocked() {
		return this.accBlocked;
	}
	
	
	
}
