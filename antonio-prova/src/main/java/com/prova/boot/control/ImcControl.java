package com.prova.boot.control;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prova.boot.dto.ImcDto;



public class ImcControl {

	@GetMapping
	public ResponseEntity<String> calcularImc(@RequestBody ImcDto imc){
		new ImcDto(imc.getPeso(), imc.getAltura());
		return ResponseEntity.ok(imc.getResultado());
	}
}
