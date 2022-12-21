package bank.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("bank/com/NewFile1.xml");
		Customer c1=(Customer)c.getBean("customer");
		System.out.println(c1);
		Account a1=c1.getAccount();
		a1.withdraw();
		a1.deposite();
	}
}
