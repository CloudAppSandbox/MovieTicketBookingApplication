package meridiancoder.movieticketmanagement.entities;

import lombok.Data;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class Relationship {
    String sourceEntity;
    String sourceEntityId;
    String targetEntity;
    String targetEntityId;
}
