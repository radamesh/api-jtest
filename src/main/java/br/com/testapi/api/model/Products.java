package br.com.testapi.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Products")
public class Products {
	@Id
	private int id;
	private String nome;
	private String tipo;
	private String preco;
	private String descricao;
}
