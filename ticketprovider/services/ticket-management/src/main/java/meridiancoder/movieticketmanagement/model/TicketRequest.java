package meridiancoder.movieticketmanagement.model;

import lombok.Data;

/**
 * Created by Sabi on 11/12/2019.
 */
@Data
public class TicketRequest {
    String userId;
    String cinemaId;
    String screenId;
    String slotId;
    String movieId;
    String seatId;
}
