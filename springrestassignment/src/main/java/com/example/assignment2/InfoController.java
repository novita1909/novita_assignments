package com.example.assignment2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@Autowired
	private zipInfoService zipInfoService;

	@GetMapping("/zips")
	public List<zipInfo> getInfo()
	{
		return this.zipInfoService.getZips();
	}
	
	@GetMapping("zips/{zip}")
	public zipInfo getzipInfo(@PathVariable String zip) {
	return this.zipInfoService.getZips(Long.parseLong(zip))	;
	}
	
	
}
