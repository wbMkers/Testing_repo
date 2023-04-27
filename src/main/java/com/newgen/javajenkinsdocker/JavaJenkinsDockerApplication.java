package com.newgen.javajenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

@SpringBootApplication
public class JavaJenkinsDockerApplication {

	public static boolean checknumber(int a)
	{
		return  a%2==0;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaJenkinsDockerApplication.class, args);
		  int a=19;
             System.out.println("Hello world");
		   System.out.println(checknumber(a));
	}

}
