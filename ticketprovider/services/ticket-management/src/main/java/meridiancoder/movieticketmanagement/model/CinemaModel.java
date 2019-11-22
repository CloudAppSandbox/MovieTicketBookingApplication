package meridiancoder.movieticketmanagement.model;

import lombok.Data;
import meridiancoder.movieticketmanagement.entities.Cinema;

import java.util.List;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class CinemaModel {
    Cinema cinema;
    List <ScreenModel> screens;
}