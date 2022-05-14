package dz.univbechar.tst;

import dz.univbechar.tst.entity.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TstApplication {


	public static void main(String[] args) {
		Actor actor = new Actor();

		SpringApplication.run(TstApplication.class, args);
	}

}
