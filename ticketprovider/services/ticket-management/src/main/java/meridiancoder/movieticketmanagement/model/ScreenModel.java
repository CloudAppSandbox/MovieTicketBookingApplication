package meridiancoder.movieticketmanagement.model;

import lombok.Data;
import meridiancoder.movieticketmanagement.entities.Seat;

import java.util.List;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class ScreenModel {
    String id;
    List <SlotModel> slots;
    List <Seat> seats;
}
