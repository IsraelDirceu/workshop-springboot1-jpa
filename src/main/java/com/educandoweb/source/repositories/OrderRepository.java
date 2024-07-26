package com.educandoweb.source.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.source.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
