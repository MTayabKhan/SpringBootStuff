package com.example.person.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.domain.Tarnished;

import service.TarnishedService;

@RestController

public class TarnishedController {

	private TarnishedService service;

	@Autowired
	public TarnishedController(TarnishedService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create") // @RequestBody pulls the parameter from the body of the request
	public ResponseEntity<Tarnished> createTarnished(@RequestBody Tarnished t) {

		Tarnished created = this.service.createTarnished(t);
		ResponseEntity<Tarnished> response = new ResponseEntity<Tarnished>(created, HttpStatus.CREATED); // 201 -
																											// created
		return response;
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Tarnished>> getAllFools() {
		return ResponseEntity.ok(this.service.getAllFools());
	}

	@GetMapping("/get/{id}") // 200 ok
	public Tarnished getTarnised(@PathVariable Integer id) {
		return this.service.getTarnished(id);
	}

	@PutMapping("/replace/{id}") // 202 accepted
	public ResponseEntity<Tarnished> replacePerson(@PathVariable Integer id, @RequestBody Tarnished newTarnished) {
		Tarnished body = this.service.replaceTarnished(id, newTarnished);
		ResponseEntity<Tarnished> response = new ResponseEntity<Tarnished>(body, HttpStatus.ACCEPTED);
		return response;
	}

	@DeleteMapping("/remove/{id}") // 204 no content
	public ResponseEntity<?> removePerson(@PathVariable Integer id) {
		this.service.removePerson(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
