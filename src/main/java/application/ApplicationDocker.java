package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class ApplicationDocker {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDocker.class, args);
	}
	
	@RequestMapping(value = "/")
	public ModelAndView aboutDocker() {
		ModelAndView modelAndView = new ModelAndView("docker.html"); 
		
		return modelAndView;
	}

}
