package com.houseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houseservice.model.ServiceCatalouge;

public interface ServiceCatalougeRepository extends JpaRepository<ServiceCatalouge,Integer> {

}
