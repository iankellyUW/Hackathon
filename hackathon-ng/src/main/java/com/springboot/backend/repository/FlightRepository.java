package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
