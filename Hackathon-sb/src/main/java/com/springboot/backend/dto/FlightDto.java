package com.springboot.backend.dto;

import java.time.LocalDate;

public class FlightDto {
	private Integer id;
	private String source;
	private String destination;
	private LocalDate departureDate;
	private String departureTime;
	private LocalDate arrivalDate;
	private String arrivalTime;
	private String journeyDuration;
	private Double adultFare;
	private Double childFare;
	private Integer totalSeats;
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
	
}
