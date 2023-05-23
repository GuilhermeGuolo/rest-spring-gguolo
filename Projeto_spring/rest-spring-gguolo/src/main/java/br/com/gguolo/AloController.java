package br.com.gguolo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloController {
	
	private static final String template = "Alooooo, %s";
	private final AtomicLong count = new AtomicLong();
	
	@RequestMapping("/alo")
	public Alo alo(@RequestParam (value = "name", defaultValue = "World") String name) {
		
		return new Alo(count.incrementAndGet() , String.format(template, name));
		
	}

}
