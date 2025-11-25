package com.receptaria;

import org.springframework.boot.SpringApplication;

public class TestReceptariaApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReceptariaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
