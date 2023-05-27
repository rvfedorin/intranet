package rv.fedorin.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rv.fedorin.intranet.model.DeviceType;

public interface DeviceTypeRepository extends JpaRepository<Long, DeviceType> {
}
