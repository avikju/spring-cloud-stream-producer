package com.avik.cloud.stream.producer.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avik.cloud.stream.producer.model.Book;

@RestController
@RequestMapping("books")
public class BookResource {

	@Autowired
	private MessageChannel output;
	
	@PostMapping
	public Book publishBook(@RequestBody Book book) {
		output.send(MessageBuilder.withPayload(book).build());
		return book;
	}
}
