package com.teamairline.flightManagementSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamairline.flightManagementSystem.bean.Passenger;

public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private PassengerRepository repository;
	
	@Override
	public void save(Passenger passenger) {
		repository.save(passenger);
	}


}
