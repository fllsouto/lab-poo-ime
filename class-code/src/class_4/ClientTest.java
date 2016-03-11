// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 4 - 03/10/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class_4;

import static org.junit.Assert.*;
import org.junit.*;

@SuppressWarnings("unused")
public class ClientTest {

	public static final double DELTA = 0.01;
	public static int accNumberBase;
	
	@Before
	public void setAccNumberBase() {
		Client.resetStaticVars();
		accNumberBase = Client.getAccNumberBase();
	}
	
	@Test
	public void testConstructorNameAndBalace() {
		String name = "Fellipe Souto";
		double balance = 10000;

		Client client = Client.getNewClient(name, balance);

		assertEquals(client.getName(), name);
		assertEquals(client.getBalance(), balance, DELTA);
	}
	
	@Test
	public void testConstructorName() {
		String name = "Fellipe Souto";
		double balance = 0;

		Client client = Client.getNewClient(name);

		assertEquals(client.getName(), name);
		assertEquals(client.getBalance(), balance, DELTA);
	}
	
	@Test
	public void testAccNumber() {
		String nameOne = "Fellipe Souto";
		double balanceOne = 0;

		String nameTwo = "Maria Luiza";
		double balanceTwo = 10000.0;

		Client clientOne = Client.getNewClient(nameOne);
		Client clientTwo = Client.getNewClient(nameTwo, balanceTwo);

		assertEquals(clientOne.getAccNumber(), accNumberBase + 1);
		assertEquals(clientTwo.getAccNumber(), accNumberBase + 2);
	}

	
	@Ignore
	public void testCashWithdrawalIgnored() {
		String name = "Fellipe Souto";
		double balance = 10000.0;
		double withdrawalOne = 5000.0;
		double withdrawalTwo = 7000.0;
		
		Client client = Client.getNewClient(name, balance);
		assertTrue(client.cashWithdrawal(withdrawalOne));
		assertEquals(client.getBalance(), balance - withdrawalOne, DELTA);
		assertFalse(client.cashWithdrawal(withdrawalTwo));
	}
	
	@Test
	public void testCashDeposit() {
		String name = "Fellipe Souto";
		double balance = 10000.0;
		double deposit = 5000.0;

		Client client = Client.getNewClient(name, balance);
		assertTrue(client.cashDeposit(deposit));
		assertEquals(client.getBalance(), balance + deposit, DELTA);
		
	}
	
	@Test
	public void testAccDetails() {
		String name = "Fellipe Souto";
		double balance = 10000.0;
		int accNumber = accNumberBase + 1;
		String accDetails = "Name: " +  name + "\nBalance: " + balance + "\nAccount Number: " + accNumber;

		Client client = Client.getNewClient(name, balance);
		assertEquals(client.getAccDetails(), accDetails);
		
	}

	@Test
	public void testHaveCash() {
		String name = "Fellipe Souto";
		double balance = 10000.0;
		double cashOne = 200.0;
		double cashTwo = 20000.0;
		
		Client client = Client.getNewClient(name, balance);
		assertTrue(client.haveCash(cashOne));
		assertFalse(client.haveCash(cashTwo));
		
	}
	
	@Test
	public void testHaveSameName() {
		String nameOne = "Fellipe Souto";
		String nameTwo = "Fellipe Silva";
		
		Client client = Client.getNewClient(nameOne);
		assertTrue(client.haveSameName(nameOne));
		assertFalse(client.haveSameName(nameTwo));
		
	}
	
	@Test
	public void testCashWithdrawal() {
		String name = "Fellipe Souto";
		double balance = 10000.0;
		double withdrawalOne = 5000.0;
		double withdrawalTwo = -5000.0;
		double withdrawalThree = 6000.0;
		double deposit = 2000.0;
		
		Client client = Client.getNewClient(name, balance);
		
		assertTrue(client.cashWithdrawal((withdrawalOne)));
		assertFalse(client.cashWithdrawal((withdrawalTwo)));
		assertEquals(client.getBalance(), balance - withdrawalOne, DELTA);
		assertFalse(client.accBlocked());

		client.cashWithdrawal(withdrawalThree);
		assertTrue(client.accBlocked());

		client.cashDeposit(deposit);
		assertFalse(client.accBlocked());
	}
	
	@Test
	public void testBlockedAccCount() {
		String nameOne = "Fellipe Souto";
		double balanceOne = 0;

		String nameTwo = "Maria Luiza";
		double balanceTwo = 100.0;
		
		double withdrawal = 500.0;
		int blockedAccCounter = 0;
		
		Client clientOne = Client.getNewClient(nameOne);
		Client clientTwo = Client.getNewClient(nameTwo, balanceTwo);
		assertEquals(Client.blockedAcc(), blockedAccCounter++);
		
		clientOne.cashWithdrawal(withdrawal);
		assertTrue(clientOne.accBlocked());
		assertEquals(Client.blockedAcc(), blockedAccCounter++);
		
		clientTwo.cashWithdrawal(withdrawal);
		assertTrue(clientTwo.accBlocked());
		assertEquals(Client.blockedAcc(), blockedAccCounter);
	}
	
	@Test
	public void testMaxOfAccounts() {
		int clientCounter = 0;
		String nameOne = "Fellipe Souto";
		double balanceOne = 0;

		String nameTwo = "Maria Luiza";
		double balanceTwo = 100.0;
		
		String nameThree = "João Paulo";
		double balanceThree = 0;

		String nameFour = "Juliana Luz";
		double balanceFour = 100.0;
		
		String nameFive = "Ana Paula";
		double balanceFive = 200.0;

		String nameSix = "Alberto Camus";
		double balanceSix = 500.0;
		
		Client clientOne = Client.getNewClient(nameOne, balanceOne);
		assertEquals(Client.getClientCounter(), ++clientCounter);
		
		Client clientTwo = Client.getNewClient(nameTwo, balanceTwo);
		assertEquals(Client.getClientCounter(), ++clientCounter);
		
		Client clientThree = Client.getNewClient(nameThree, balanceThree);
		assertEquals(Client.getClientCounter(), ++clientCounter);
		
		Client clientFour = Client.getNewClient(nameFour, balanceFour);
		assertEquals(Client.getClientCounter(), ++clientCounter);

		Client clientFive = Client.getNewClient(nameFive, balanceFive);
		assertEquals(Client.getClientCounter(), ++clientCounter);

		assertNull(Client.getNewClient(nameSix, balanceSix));

		assertTrue(clientFive.finalizeClientAcc());
		clientCounter--;

		Client clientSix = Client.getNewClient(nameSix, balanceSix);
		assertNotNull(clientSix);
		assertEquals(Client.getClientCounter(), ++clientCounter);
		
	}
	

	

}
