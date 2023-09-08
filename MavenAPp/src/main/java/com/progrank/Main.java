package com.progrank;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;
@Sp

@SpringBootApplication
public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context=  SpringApplication.run(Main.class,args);
		
	}

}
