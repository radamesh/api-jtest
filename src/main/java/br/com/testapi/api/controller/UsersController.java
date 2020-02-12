package br.com.testapi.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.testapi.api.model.Users;
import br.com.testapi.api.repository.UsersRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsersController {

	@Autowired
	private UsersRepository repository;
	
	@GetMapping("/test")
	public String getPing() {
		return "Poing";
	}

	@PostMapping("/inset-user")
	public String insertUser(@RequestBody Users user) {
		repository.save(user);
		return "Usuario adicionado com sucesso: "; // + user.getId();
	}

	@PutMapping( "/update-user/{id}")
	public String updateUser(@RequestBody Users user, @PathVariable int id) {
		repository.save(user);
		return "Usuario atualizado com sucesso: " + id;
	}
	
	@DeleteMapping("/delete-user/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "Usuario DELETADO com sucesso: " + id;
	}

	@GetMapping("/users")
	public List<Users> getUsers() {
		return repository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<Users> getUsers(@PathVariable int id) {
		return repository.findById(id);
	}
}
