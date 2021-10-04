package cn.org.sprouts.demo;

import cn.org.sprouts.demo.user.domain.AuthorizationPO;
import cn.org.sprouts.demo.user.domain.RolePO;
import cn.org.sprouts.demo.user.domain.UserPO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				UserPO.class, RolePO.class, AuthorizationPO.class);
		System.out.println("user: " + context.getBean("userPO"));
		System.out.println("role: " + context.getBean("rolePO"));
		System.out.println("authorization: " + context.getBean("authorizationPO"));
	}
}
