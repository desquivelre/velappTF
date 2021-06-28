package pe.edu.upc.velapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.service.crud.RegisterService;

@Controller
@RequestMapping("/auth")
public class RegisterController {

	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "login";
	}
	
	@GetMapping("/registro")
	public String registroForm(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "/loginvista.html";
	}
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/CrearUsuario")
	public String registro(@ModelAttribute( "usuario") Usuario usuario ,Model model) {
		try {
			
			
			Usuario usuarioreturn = registerService.create(usuario); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/auth/login";
	}
	
}
