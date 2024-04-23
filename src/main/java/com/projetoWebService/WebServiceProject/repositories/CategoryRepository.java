package com.projetoWebService.WebServiceProject.repositories;

import com.projetoWebService.WebServiceProject.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
