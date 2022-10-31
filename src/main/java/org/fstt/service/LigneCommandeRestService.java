package org.fstt.service;

import java.util.List;

import org.fstt.entities.LigneCommande;
import org.fstt.metier.LigneCommandeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LigneCommandeRestService {
	@Autowired
	private LigneCommandeMetier ligneCommandeMetier;
	
	@RequestMapping(value = "/addLigneCommande/{id}", method = RequestMethod.POST)
	public LigneCommande addLigneCommande(@RequestBody LigneCommande ligneCommande, @PathVariable Long id) {
		return ligneCommandeMetier.saveLigneCommande(ligneCommande, id);
	}
	
	@RequestMapping(value = "/updateLigneCommande/{id}", method = RequestMethod.PUT)
	public LigneCommande updateLigneCommande(@RequestBody LigneCommande ligneCommande, @PathVariable Long id) {
		return ligneCommandeMetier.updateLigneCommande(ligneCommande, id);
	}
	
	@RequestMapping(value = "/getLigneCommande/{id}", method = RequestMethod.GET)
	public LigneCommande getLigneLigneCommande(@PathVariable Long id) {
		return ligneCommandeMetier.getLigneCommande(id);
	}
	
	@RequestMapping(value = "/deleteLigneCommande/{id}", method = RequestMethod.DELETE)
	public void deleteLigneCommande(@PathVariable Long id) {
		ligneCommandeMetier.deleteLigneCommande(id);
	}
	
	@RequestMapping(value = "/ligneCommandes", method = RequestMethod.GET)
	public List<LigneCommande> listLigneCommande() {
		return ligneCommandeMetier.listLigneCommande();
	}
}
