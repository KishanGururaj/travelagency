package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.makemytrip.IMakeMyTrip;

public class TravelAgencyUtil {
	public static void main(String[] args) {
		System.out.println("enter the booking  in vrl or srs");
		Scanner scanner =new Scanner(System.in);
		String type=scanner.next();
		IMakeMyTrip iMakeMyTrip=TravelAgencyFactory.getCompany(type);
		if (iMakeMyTrip!=null) {
			if(iMakeMyTrip.check()) {
				System.out.println("enter the no of bookings");
				int booking=scanner.nextInt();
				
				iMakeMyTrip.acceptBooking(booking);
				scanner.close();
			}
			else {
				System.out.println("no warranty");
			}
			
			
		}
	}

}
