package us.adgesh.routezips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({@ComponentScan("us.adgesh.routezips.controllers")})

public class RouteZipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouteZipsApplication.class, args);
	}

}
