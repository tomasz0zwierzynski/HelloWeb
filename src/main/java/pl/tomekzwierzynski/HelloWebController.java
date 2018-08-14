package pl.tomekzwierzynski;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

	@RequestMapping("/hello")
	String hello(@RequestParam(value = "name", defaultValue="Web") String name) {
	 return "Hello, " + name;
	}
	
}
