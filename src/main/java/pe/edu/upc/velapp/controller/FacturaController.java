package pe.edu.upc.velapp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.velapp.entities.Cartera;
import pe.edu.upc.velapp.entities.Operacion;
import pe.edu.upc.velapp.service.crud.CarteraService;
import pe.edu.upc.velapp.service.crud.OperacionService;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private CarteraService carteraService;
	
	@Autowired
	private OperacionService operacionService;
	
	@GetMapping("{id}") 
	public String response(Model model, @PathVariable Integer id) {
		try {
			Optional<Cartera> cartera = carteraService.findById(id);
			if(cartera.isPresent()) {
						
				Operacion operacion = new Operacion();
				List<Operacion> numoperacion = operacionService.getAll();
				
				operacion.setCOperacion(numoperacion.size()+1);
				operacion.setCartera(cartera.get());
				
				
				
				model.addAttribute("cartera", cartera.get());
				model.addAttribute("newFactura", operacion);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "/nuevaFactura.html";
	 }
	
	@PostMapping("crearfactura")
	public String CrearFactura(@ModelAttribute("newFactura") Operacion operacion) {
		try {
				
			Operacion operacionReturn = operacionService.create(operacion);
					
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/cartera/" + operacion.getCartera().getCCartera();
	}
	
	
	
	
	
}

