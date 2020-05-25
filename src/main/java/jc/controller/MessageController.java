package jc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jc.entity.Message;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path="/messages", produces=MediaType.APPLICATION_JSON_VALUE)
public class MessageController {
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> create() {
		return ResponseEntity.ok(new Message());
	}
	
	@GetMapping
	public ResponseEntity<Message> read() {
		return ResponseEntity.ok(new Message());
	}
	
	@PutMapping
	public ResponseEntity<String> update() {
		log.error("message not allowed");
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("");
	}
	
	@DeleteMapping
	public ResponseEntity<Message> delete() {
		return ResponseEntity.ok(new Message());
	}
}
