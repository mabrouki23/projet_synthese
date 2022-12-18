package ca.qc.bdeb.projetSynthese.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.qc.bdeb.projetSynthese.models.Commande;
import ca.qc.bdeb.projetSynthese.services.CommandeServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="/api")
@AllArgsConstructor
public class CommandeController {
	
	private CommandeServiceImpl commandeServiceImpl;
	@RequestMapping(path = "/commandes")
	public List<Commande>getAllCommandes(){
		 return commandeServiceImpl.getAllcommandes();
		
	}
	
}
