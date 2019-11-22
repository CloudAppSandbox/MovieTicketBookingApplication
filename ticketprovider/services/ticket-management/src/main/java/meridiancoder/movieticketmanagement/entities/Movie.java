package meridiancoder.movieticketmanagement.entities;

import lombok.Data;

@Data
public class Movie {
    String id;
    String name;
    String url;
    float imbdRating;
    int durationInMinutes;
}
