package bank.com;

public class Current implements Account {
	@Override
	public void withdraw() {
		System.out.println("withdraw from current account");		
	}
	public void deposite() {
		System.out.println("deposite from current account");
	}
}
