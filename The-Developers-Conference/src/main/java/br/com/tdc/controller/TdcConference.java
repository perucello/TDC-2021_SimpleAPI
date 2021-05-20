package br.com.tdc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TdcConference {

	@GetMapping(path = { "/tdc2021"}) //http://localhost:8080/tdc2021
	public String Tdc2021() {
		return "PCD - Pessoa com Determinacao - The Developer's Conference !";

	}
	

	

}