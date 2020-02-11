package br.com.testapi.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.testapi.api.model.Users;

public interface UsersRepository extends MongoRepository<Users, Integer>{

}
