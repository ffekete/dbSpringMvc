package backend.service;

import org.springframework.beans.factory.annotation.Autowired;

import backend.dao.ClientRepository;
import backend.domain.Client;

public class BankService {
	private ClientRepository clientRepository;
	
	@Autowired
	public BankService(ClientRepository clinetRepository){
		this.clientRepository = clinetRepository;
	}
	
	public Iterable<Client> listClients(){
		return clientRepository.findAll();
	}
}
