package cn.org.sprouts.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Object bean = applicationContext.getBean("user");
		System.out.println(bean);
	}
}
