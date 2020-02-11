package br.com.testapi.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Users")
public class Users {
	@Id
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	
}
