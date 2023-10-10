package com.mycompnany.api.unit.conversion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unit-conversion")
public class UnitConverstionApi {

	@PostMapping
	public ConversionDetails convert(@RequestBody ConversionDetails details) {
		UnitConverter.convert(details);
		
		return details;
	}
	
	

}
