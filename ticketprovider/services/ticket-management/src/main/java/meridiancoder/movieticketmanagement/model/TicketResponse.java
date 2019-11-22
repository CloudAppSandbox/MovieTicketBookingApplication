package meridiancoder.movieticketmanagement.model;


import lombok.Data;
import meridiancoder.movieticketmanagement.entities.Ticket;

/**
 * Created by Sabi on 11/13/2019.
 */
@Data
public class TicketResponse {
    Ticket ticket;
    String status;
    String message;
}
