package fr.francois.testsiret.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiretController {
	@GetMapping("/etablishement/{siret}")
	public String getSiret(@PathVariable String siret) {
		return siret;
		
	}
}
