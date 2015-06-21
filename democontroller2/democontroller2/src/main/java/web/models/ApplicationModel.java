package web.models;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.demo.core.metier.IMetier;
import org.demo.core.metier.Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//l'implémentation de IMetier vient du projet dataBDD2. La dépendence du projet se trouve dans le POM
@Component
public class ApplicationModel implements IMetier{


	@Autowired
	private Metier métier;
	
	
	@Override
	public List<Client> getAllClients() {
		return métier.getAllClients();
	}

	public Client saveClient(Client client) {
		return métier.saveClients(client);
	}
	
	
	@Override
	public List<Compte> getAllComptes() {
		return métier.getAllComptes();
	}

	public Compte saveCompte(Compte compte) {
		return métier.saveComptes(compte);
	}

	
	
	
	@Override
	public List<Courant> getAllCourant() {
		return métier.getAllCourant();
	}

	public Courant saveCourant(Courant courant) {
		return métier.saveCourant(courant);
	}
	
}
