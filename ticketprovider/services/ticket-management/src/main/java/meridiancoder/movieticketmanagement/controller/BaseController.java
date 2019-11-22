package meridiancoder.movieticketmanagement.controller;

import meridiancoder.movieticketmanagement.entities.Cinema;
import meridiancoder.movieticketmanagement.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Sabi on 11/22/2019.
 */

@RestController
public class BaseController {

    @Autowired
    BaseService baseService;

    @GetMapping("/getCinemaList")
    public List <Cinema> getCinemaList() {
        return baseService.getCinemasList();
    }
}
