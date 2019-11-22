package meridiancoder.movieticketmanagement.entities;

import lombok.Data;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class Seat {
    String id;
    String category; // Q class, Basic etc
    boolean available;
}
