package com.projetoWebService.WebServiceProject.repositories;

import com.projetoWebService.WebServiceProject.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
