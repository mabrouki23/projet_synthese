package ca.qc.bdeb.projetSynthese.services;
import java.util.List;

import org.springframework.stereotype.Service;

import ca.qc.bdeb.projetSynthese.models.Commande;
import ca.qc.bdeb.projetSynthese.repositories.CommandeRepository;
@Service
public class CommandeServiceImpl implements CommandeServiceInterface {
	private CommandeRepository commandeRepository;
	public CommandeServiceImpl(CommandeRepository commandeRepository) {		
		this.commandeRepository = commandeRepository;
	}
	@Override
	public List<Commande> getAllcommandes() {		
		return commandeRepository.findAll();
	}
	

	
}
