package meridiancoder.movieticketmanagement.dao;

import meridiancoder.movieticketmanagement.entities.Cinema;
import meridiancoder.movieticketmanagement.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sabi on 11/22/2019.
 */

@Repository
public class BaseDAO {

    @Autowired
    private BaseRepository baseRepository;

    public List <Cinema> getCinemasList() {
        return baseRepository.getCinemasList();
    }
}
