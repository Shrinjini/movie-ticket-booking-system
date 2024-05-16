# movie-ticket-booking-system
This is a movie-ticket-booking-system application, developed for Sapiens hands-on.

This has below modules:
1. movie-service: This is the movie service, responsible for movie name, show time and show seats available
            This will call movie-booking-service, and on getting successful response, will reduce seats available
2. movie-booking-service: Which is responsible for booking the movie tickets, based on FCFS basis
            This will call payment-service, and on getting successful response, will send success message to user
3. payment-service: Which handles the monetary transactions, and sends success response back to movie-booking-service
