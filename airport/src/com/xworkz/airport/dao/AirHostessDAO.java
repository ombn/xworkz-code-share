package com.xworkz.airport.dao;

import com.xworkz.airport.dto.AirHostessDTO;

public interface AirHostessDAO {
	
	public void store(AirHostessDTO dto);
	
	 default public void understand(){
		 System.out.println("invoked understand");
	 }
	 
	 public AirHostessDTO fetchById(int id);
	

}
