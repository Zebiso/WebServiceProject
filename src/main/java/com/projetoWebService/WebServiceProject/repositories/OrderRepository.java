package com.projetoWebService.WebServiceProject.repositories;

import com.projetoWebService.WebServiceProject.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
