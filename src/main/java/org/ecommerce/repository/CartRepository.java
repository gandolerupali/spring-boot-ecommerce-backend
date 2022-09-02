package org.ecommerce.repository;


import java.util.List;

import org.ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	public List<Cart> findByemail(String email);
	public <Optional> Cart findByproductId(int productId);
}
