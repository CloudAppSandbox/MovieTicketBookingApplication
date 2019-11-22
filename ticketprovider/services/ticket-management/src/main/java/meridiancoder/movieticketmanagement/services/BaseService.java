package meridiancoder.movieticketmanagement.services;


import meridiancoder.movieticketmanagement.dao.BaseDAO;
import meridiancoder.movieticketmanagement.entities.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sabi on 11/22/2019.
 */


@Service
public class BaseService {

    @Autowired
    BaseDAO baseDAO;

    public List <Cinema> getCinemasList() {
        return baseDAO.getCinemasList();
    }

}
