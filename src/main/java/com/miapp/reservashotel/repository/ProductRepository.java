package com.miapp.reservashotel.repository;

import com.miapp.reservashotel.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByName(String name);

    List<Product> findByCategoryId(Long categoryId);

    List<Product> findByCity_NameIgnoreCase(String city);
}

