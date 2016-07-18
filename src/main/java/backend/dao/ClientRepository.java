package backend.dao;

import org.springframework.data.repository.CrudRepository;

import backend.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
}
