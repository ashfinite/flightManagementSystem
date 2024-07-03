package com.teamairline.flightManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamairline.flightManagementSystem.bean.FlightUser;
import java.util.Optional;


public interface FlightUserRepository extends JpaRepository<FlightUser, String> {
	Optional<FlightUser> findByUsername(String username);
}

