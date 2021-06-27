package pe.edu.upc.velapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearcartera")
public class CrearCarteraController {
	@GetMapping
	public String response() {
		return "/Datos_cartera.html";
 }
}