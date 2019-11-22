package meridiancoder.movieticketmanagement;

import meridiancoder.movieticketmanagement.datafeed.DataFeed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Created by Sabi on 11/22/2019.
 */

@SpringBootApplication
public class TicketProviderApplication {
    @Autowired
    DataFeed dataFeed;

    public static void main(String args[]) {
        SpringApplication.run(TicketProviderApplication.class, args);
    }


    @PostConstruct
    public void loadDataFeed() {
        dataFeed.loadDataFeed();
    }

}


