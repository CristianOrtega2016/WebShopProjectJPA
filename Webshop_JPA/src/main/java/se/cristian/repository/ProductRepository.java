package se.cristian.repository;

import java.util.List;

import se.cristian.model.Product;

public interface ProductRepository extends CrudRepository<Product>
{
	List<Product> fetchAll();
	List<Product> searchProductsBasedOnProductName(final String productName);
	List<Product> fetchProductsByProductName(final String productName);
}
