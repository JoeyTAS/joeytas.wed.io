package com.joeytas.Vot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller

public class inicio1{
	@GetMapping("/")
	public String salu(){
	
		return "ser";
		
	}
	
	@GetMapping("/pru")
	public String inicio(){
	
		return "pru";
		
	}
	

}
