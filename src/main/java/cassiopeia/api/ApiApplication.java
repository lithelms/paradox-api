package cassiopeia.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
	@RequestMapping("/ping")
	@ResponseBody
	String ping() {
		return "<h1>Ping-<h1>";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
