package meridiancoder.movieticketmanagement.model;


import lombok.Data;
import meridiancoder.movieticketmanagement.entities.Movie;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class SlotModel {
    String id;
    Movie movie;
}
