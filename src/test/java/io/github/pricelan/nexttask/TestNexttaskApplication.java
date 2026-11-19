package io.github.pricelan.nexttask;

import org.springframework.boot.SpringApplication;

public class TestNexttaskApplication {

	public static void main(String[] args) {
		SpringApplication.from(NexttaskApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
