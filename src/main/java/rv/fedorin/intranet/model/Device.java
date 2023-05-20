package rv.fedorin.intranet.model;

import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Device {
    String name;
    DeviceType type;
    DeviceModel model;
    String ip;
    Port upPort;
    String description;
    List<Port> ports;
}
