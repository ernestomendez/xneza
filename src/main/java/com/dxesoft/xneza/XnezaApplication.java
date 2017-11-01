package com.dxesoft.xneza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class XnezaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XnezaApplication.class, args);

//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		System.out.println("password encriptado: ********************************************");
//		System.out.println(encoder.encode("bote"));
//		System.out.println("password encriptado: ********************************************");
	}
}
