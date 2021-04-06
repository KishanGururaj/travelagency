package com.wolken.wolkenapp.SRS;

import com.wolken.wolkenapp.makemytrip.IMakeMyTrip;

public class SRSImpl implements IMakeMyTrip {

	@Override
	public void acceptBooking(int booking ) {
		// TODO Auto-generated method stub
		if(booking >10) {
			System.out.println(" SRS booking confirmed");
		}
		else {
			System.out.println(" SRS booking cancelled");
		}
		}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
		
	}
	


