package com.data_jpa.learn_hibernate.repositories;

import com.data_jpa.learn_hibernate.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    List<Product> findByCreatedAtAfter(LocalDate of);

    List<Product> findByPriceGreaterThanAndQuantityLessThan(Double price, Integer quantity);

    List<Product> findByTitleLike(String title);

    List<Product> findByTitleContains(String title);

    List<Product> findByTitleContainsIgnoreCase(String title, Pageable pageable);

    @Query("select p from Product p where p.sku=:sku")
    Optional<Product> findBySku(String sku);
}
