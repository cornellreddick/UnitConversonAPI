package com.mycompnany.api.unit.conversion;

public class LenghtConverter {
	
	static void kilometer2Mile(ConversionDetails details) {
		float km = details.getFromValue();
		float miles = km * 0.621371f;
		
		details.setToValue(miles);
	}
	
	static void miles2Kilometer(ConversionDetails details) {
		float miles = details.getFromValue();
		float km = miles * 01.60934f;
		
		details.setToValue(km);
	}

}
