package com.springboot.backend.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Integer id;
	
	@Column(nullable = false)
	private String source;
	
	@Column(nullable = false)
	private String destination;
	
	@Column(nullable = false)
	private LocalDate departureDate;
	
	@Column(nullable = false)
	private String departureTime;
	
	@Column(nullable = false)
	private LocalDate arrivalDate;
	
	@Column(nullable = false)
	private String arrivalTime;
	
	@Column(nullable = false)
	private String journeyDuration;
	
	@Column(nullable = false)
	private Double adultFare;
	
	@Column(nullable = false)
	private Double childFare;
	
	@Column(nullable = false)
	private Integer totalSeats;
	
	public Flight(Integer id, String source, String destination, LocalDate departureDate, String departureTime,
			LocalDate arrivalDate, String arrivalTime, String journeyDuration, Double adultFare, Double childFare,
			Integer totalSeats) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.journeyDuration = journeyDuration;
		this.adultFare = adultFare;
		this.childFare = childFare;
		this.totalSeats = totalSeats;
	}

	public Flight() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getJourneyDuration() {
		return journeyDuration;
	}

	public void setJourneyDuration(String journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	public Double getAdultFare() {
		return adultFare;
	}

	public void setAdultFare(Double adultFare) {
		this.adultFare = adultFare;
	}

	public Double getChildFare() {
		return childFare;
	}

	public void setChildFare(Double childFare) {
		this.childFare = childFare;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", source=" + source + ", destination=" + destination + ", departureDate="
				+ departureDate + ", departureTime=" + departureTime + ", arrivalDate=" + arrivalDate + ", arrivalTime="
				+ arrivalTime + ", journeyDuration=" + journeyDuration + ", adultFare=" + adultFare + ", childFare="
				+ childFare + ", totalSeats=" + totalSeats + "]";
	}
	
	
}
