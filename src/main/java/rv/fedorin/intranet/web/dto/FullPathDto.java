package rv.fedorin.intranet.web.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import rv.fedorin.intranet.model.Region;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FullPathDto {

    String ipDevice;
    Region region;
}
