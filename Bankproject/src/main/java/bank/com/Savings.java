package bank.com;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{
	@Override
	public void withdraw() {
		System.out.println("With draw from Saving account");
	}

	@Override
	public void deposite() {
		System.out.println("deposite to saving");
	}
}
