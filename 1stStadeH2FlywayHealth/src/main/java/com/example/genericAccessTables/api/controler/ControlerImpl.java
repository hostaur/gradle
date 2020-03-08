package com.example.genericAccessTables.api.controler;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.genericAccessTables.api.resource.Request;
import com.example.genericAccessTables.api.resource.Response;

@RestController
public class ControlerImpl implements Controler {

	@Override
	public ResponseEntity<Response> getEntityList(@Valid @RequestBody Request request) {
		System.out.println(request);
		return new ResponseEntity<>(new Response(), HttpStatus.OK);
	}

}
