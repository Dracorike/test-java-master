package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.blz.testjava.model.Product;

@Repository
public interface Repositorio extends JpaRepository<Product, Long>{
	
	List<Product> listAll();
	
}
