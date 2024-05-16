package com.sapiens.movieticketbookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/movie-ticket-booking-service")
public class MovieTicketBookingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieTicketBookingSystemApplication.class, args);
	}

	@GetMapping("/main-module")
	public String mainModule()
	{
		return "main module";
	}


}
