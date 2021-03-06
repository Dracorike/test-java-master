package controller;


import java.util.List;
import br.com.blz.testjava.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import repository.Repositorio;
import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private Repositorio repositorio;
	
	@GetMapping
	public List<Product> list(){
		return repositorio.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product adicionar(@Valid @RequestBody Product produto) {
		return repositorio.save(produto);
	}
	
}
