package pe.edu.upc.velapp.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.service.crud.RegisterService;

@Controller
@RequestMapping("/Menu")
public class MenuController {
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping
	public String response(Model model) {
		try {
			Optional<Usuario> usuario = registerService.findById(1);
			if(usuario.isPresent()) {
				model.addAttribute("usuario", usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "/menu.html";
	}
}
