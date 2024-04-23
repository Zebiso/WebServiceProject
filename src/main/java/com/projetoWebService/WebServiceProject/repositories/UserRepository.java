package com.projetoWebService.WebServiceProject.repositories;

import com.projetoWebService.WebServiceProject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
