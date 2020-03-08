package com.example.genericAccessTables.api.controler;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.genericAccessTables.api.resource.Request;
import com.example.genericAccessTables.api.resource.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/api/genericDal/v1")
@CrossOrigin
@RequestMapping("/api/genericDal/v1")
public interface Controler {
	
	 	@ApiOperation(value = "Retourner la liste de l entite demandee en fonction des conditions", nickname = "entity", notes = "Retourner la liste de l entite demandee en fonction des conditions", tags = {"entity"})
	    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = Response.class)})
	    @PostMapping(value = "/entity", produces = {"application/json"}, consumes = {"application/json"})
	    ResponseEntity<Response> getEntityList(@ApiParam(value = "body de la requete", required = true) @Valid @RequestBody Request request );

}
