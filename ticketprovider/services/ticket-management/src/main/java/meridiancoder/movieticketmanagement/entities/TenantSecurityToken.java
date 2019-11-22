package meridiancoder.movieticketmanagement.entities;

import lombok.Data;

/**
 * Created by Sabi on 11/22/2019.
 */

@Data
public class TenantSecurityToken {
    public String accessId;
    public String accessKey;
}
