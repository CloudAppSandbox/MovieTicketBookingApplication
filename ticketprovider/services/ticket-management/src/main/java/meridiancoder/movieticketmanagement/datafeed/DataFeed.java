package meridiancoder.movieticketmanagement.datafeed;

import com.google.gson.Gson;
import lombok.Data;
import meridiancoder.movieticketmanagement.model.CinemaModel;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
@Configuration
public class DataFeed {

    public CinemaModel[] cinemas;

    public void loadDataFeed() {
        String fileName = "datafeed.json";
        String data;
        InputStream in = getClass().getClassLoader().getResourceAsStream(fileName);
        try (Scanner scanner = new Scanner(in, StandardCharsets.UTF_8.name())) {
            data = scanner.useDelimiter("\\A").next();
        }
        cinemas = new Gson().fromJson(data.toString(), CinemaModel[].class);
    }

}
