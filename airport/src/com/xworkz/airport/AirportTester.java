package com.xworkz.airport;

import com.xworkz.airport.dao.AirHostessDAO;
import com.xworkz.airport.dao.AirHostessDAOImpl;
import com.xworkz.airport.dto.AirHostessDTO;

public class AirportTester {

	public static void main(String[] args) {

		// data

		AirHostessDTO airHostessDTO = new AirHostessDTO();
		airHostessDTO.setName("Mast Kalandar");
		airHostessDTO.setAge(23);
		airHostessDTO.setHeight(5.7);
		airHostessDTO.setHobbie("Video Calling");
		//airHostessDTO.setId(2);

		// logic

		AirHostessDAOImpl dao = new AirHostessDAOImpl();
		//dao.store(airHostessDTO);
		
dao.understand();

	}

}
