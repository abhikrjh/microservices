package com.abhicode.ProductService.repository;

import com.abhicode.ProductService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where customerId =:cId")
    public List<Product> getProductByCustomerId(@Param("cId") int customerId);
}
