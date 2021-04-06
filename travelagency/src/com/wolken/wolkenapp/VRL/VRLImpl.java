package com.wolken.wolkenapp.VRL;

import com.wolken.wolkenapp.makemytrip.IMakeMyTrip;

public class VRLImpl implements IMakeMyTrip {

	@Override
	public void acceptBooking(int booking ) {
		// TODO Auto-generated method stub
		if(booking >10) {
			System.out.println("VRL booking confirmed");
		}
		else {
			System.out.println("VRL booking cancelled");
		}
			
	}

	public boolean check() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
