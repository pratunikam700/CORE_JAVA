package sample.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ax=new ClassPathXmlApplicationContext("beans.xml");
		Person p=(Person)ax.getBean("p1");
		System.out.println(p);
		Person p1=(Person)ax.getBean("p2",Person.class);
		System.out.println(p1);
		
		
	}

}
