package myproject.autowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.autowire.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/autowire/resources/applicationContext.xml");
		Employee empBean = (Employee) context.getBean("empBean");
		empBean.getEmpDetails();
	}
}
