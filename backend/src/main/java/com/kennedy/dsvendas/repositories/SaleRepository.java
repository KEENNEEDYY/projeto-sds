package com.kennedy.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennedy.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
