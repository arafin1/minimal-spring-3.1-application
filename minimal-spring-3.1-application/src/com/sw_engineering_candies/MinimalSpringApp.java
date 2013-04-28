package com.sw_engineering_candies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MinimalSpringApp {

	private static final String CONFIG_PATH = "classpath*:com/sw_engineering_candies/application-config.xml";

	@Autowired
	Foo myBean;

	void sayHello() {
		System.out.println(myBean.run("Hello World - "));
	}

	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		final MinimalSpringApp minimalSpringApp = context.getBean(MinimalSpringApp.class);
		minimalSpringApp.sayHello();
	}

}
