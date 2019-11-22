# MovieTicketBookingApplication
This repository provides MovieTicketBooking Application.

MovieTicketBookingApplication
    |__ TicketAggregator
    |__ TicketProvider

TicketAggregator:
1. Provides services for a user to book movie tickets.
2. Integrates with TicketProvider services to fetch movie related information and books ticket on behalf of the user.
3. Sends notifications to the user with the ticket information.

TicketProvider:
1. Provides services for a aggregator to book movie tickets.
2. Manages data related to screens, movies, seats, tickets etc.

