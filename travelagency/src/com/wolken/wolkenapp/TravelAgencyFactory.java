package com.wolken.wolkenapp;

import com.wolken.wolkenapp.SRS.SRSImpl;
import com.wolken.wolkenapp.VRL.VRLImpl;
import com.wolken.wolkenapp.makemytrip.IMakeMyTrip;

public class TravelAgencyFactory {
	public static IMakeMyTrip getCompany(String type) {
		if(type.equalsIgnoreCase("SRS")) {
			return new SRSImpl();
		}
		else if(type.equalsIgnoreCase("VRL")) {
			return new VRLImpl();
		}
		else {
			System.out.println("no agency found ");
		}
		return null;
	}

}
