package com.docker.test.dockertest;

import java.util.Date;
import javax.ws.rs.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}

@RestController
@Path("/")
class HelloDockerRestController {
	@RequestMapping("/hello/{name}")
	public String helloDocker(@PathVariable(value = "name") String name) {
		String response = "Hello " + name + " Response received on : " + new Date();
		System.out.println(response);
		return response;

	}
}