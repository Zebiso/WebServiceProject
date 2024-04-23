package com.projetoWebService.WebServiceProject.repositories;

import com.projetoWebService.WebServiceProject.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
