package pe.edu.upc.velapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class index {
	@GetMapping
	public String response() {
		return "/login.html";
	}
}
