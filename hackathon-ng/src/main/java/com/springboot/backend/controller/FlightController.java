package com.springboot.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.dto.FlightDto;
import com.springboot.backend.model.Flight;
import com.springboot.backend.repository.FlightRepository;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@PostMapping("/flights")
	public Flight postFlight(@RequestBody Flight flight) {
		return flightRepository.save(flight);
	}
	
	@GetMapping("/flights")
	public List<FlightDto> getFlights() {
		List<Flight> list = flightRepository.findAll();
		List<FlightDto> dto = new ArrayList<>();
		list.stream().forEach(e-> {
			FlightDto temp = new FlightDto();
			temp.setId(e.getId());
			temp.setSource(e.getSource());
			temp.setDestination(e.getDestination());
			temp.setDepartureDate(e.getDepartureDate());
			temp.setDepartureTime(e.getDepartureTime());
			temp.setArrivalDate(e.getArrivalDate());
			temp.setArrivalTime(e.getArrivalTime());
			temp.setJourneyDuration(e.getJourneyDuration());
			temp.setAdultFare(e.getAdultFare());
			temp.setChildFare(e.getChildFare());
			temp.setTotalSeats(e.getTotalSeats());
			dto.add(temp);
		});
		return dto;
	}
	
	
}
