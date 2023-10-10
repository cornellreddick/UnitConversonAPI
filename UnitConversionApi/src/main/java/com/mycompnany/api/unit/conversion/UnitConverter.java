package com.mycompnany.api.unit.conversion;

public class UnitConverter {
	
	static void convert(ConversionDetails details) {
		String fromUnit = details.getFromUnit();
		String toUnit = details.getToUnit();
		
		if(fromUnit.equals("km") && toUnit.equals("miles")) {
			LenghtConverter.kilometer2Mile(details);
		}else if(fromUnit.equals("miles") && toUnit.equals("km")){
			LenghtConverter.miles2Kilometer(details);
		}
	}

}
