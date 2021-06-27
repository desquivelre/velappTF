package pe.edu.upc.velapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listacartera")
public class ListaCarteraController {
	@GetMapping
	public String response() {
		return "/appoimentList.html";
	}
	
}
