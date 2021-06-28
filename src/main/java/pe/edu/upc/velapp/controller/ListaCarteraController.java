package pe.edu.upc.velapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.velapp.entities.Cartera;
import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.service.crud.CarteraService;
import pe.edu.upc.velapp.service.crud.RegisterService;

@Controller
@RequestMapping("/listacartera")
public class ListaCarteraController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private CarteraService carteraService;
	

	@GetMapping("{id}")
	public String response(Model model, @PathVariable Integer id ) {
		
		try {
			Optional<Usuario> usuario = registerService.findById(id);
			if(usuario.isPresent()) {
				
				List<Cartera> carteras  = carteraService.filterCarterasByIdUsuario(usuario.get().getId());
				model.addAttribute("usuario", usuario.get());
				model.addAttribute("carteras", carteras);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "appoimentList.html";
	}
	


	
	
	
}
