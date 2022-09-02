package org.ecommerce.repository;


import org.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


	@Repository
	public interface CategoryRepository extends JpaRepository<Category, Integer>{

		 public void deleteByCategoryId(int CategoryId);//delete category by id

		 @Query(value="delete from cart  c where c.productId = :productId",nativeQuery = true)
			public void deleteProductByproductId(@Param("productId") int productId);

}
