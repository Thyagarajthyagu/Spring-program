package referencetype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Soluction {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("referencetype/config1.xml");
		Employee e1=(Employee) c1.getBean("emp"); 
		System.out.println(e1);
	}
}
