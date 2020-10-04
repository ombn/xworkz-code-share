package com.xworkz.airport;

import com.xworkz.airport.dao.AirHostessDAO;
import com.xworkz.airport.dao.AirHostessDAOImpl;
import com.xworkz.airport.dto.AirHostessDTO;

public class FetchTester {

	public static void main(String[] args) {

		AirHostessDAO airHostessDAO=new AirHostessDAOImpl();
		AirHostessDTO entity=airHostessDAO.fetchById(1);
		System.out.println(entity);
		
	}

}
