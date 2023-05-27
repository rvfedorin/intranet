package rv.fedorin.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rv.fedorin.intranet.model.DeviceModel;

public interface DeviceModelRepository extends JpaRepository<Long, DeviceModel> {
}
