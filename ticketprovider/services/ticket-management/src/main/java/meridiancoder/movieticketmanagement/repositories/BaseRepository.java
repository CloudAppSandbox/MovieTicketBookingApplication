package meridiancoder.movieticketmanagement.repositories;

import meridiancoder.movieticketmanagement.datafeed.DataFeed;
import meridiancoder.movieticketmanagement.entities.Cinema;
import meridiancoder.movieticketmanagement.model.CinemaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sabi on 11/22/2019.
 */

@Repository
public class BaseRepository {
    @Autowired
    DataFeed dataFeedObject;

    public List <Cinema> getCinemasList() {
        List <CinemaModel> cinemaModel = Arrays.asList(dataFeedObject.getCinemas());
        List <Cinema> cinemas = new ArrayList <>(cinemaModel.size());

        cinemaModel.stream().forEach(item -> {
            cinemas.add(item.getCinema());
        });

        return cinemas;
    }

}
