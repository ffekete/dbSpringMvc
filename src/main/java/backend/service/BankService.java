package backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
