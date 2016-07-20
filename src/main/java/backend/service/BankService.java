package backend.service;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import backend.dao.ClientRepository;
import backend.domain.Client;

@Service
public class BankService {
	private ClientRepository clientRepository;
	
	@Autowired
	public BankService(ClientRepository clinetRepository){
		this.clientRepository = clinetRepository;
	}
	
	public Iterable<Client> listClients(){
		return clientRepository.findAll();
	}
	
	public void SaveClient(Client client){
		clientRepository.save(client);
	}
	
	public Client getClientById(Long id){
		return clientRepository.findOne(id);
	}
}
