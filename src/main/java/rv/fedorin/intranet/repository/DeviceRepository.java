package rv.fedorin.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rv.fedorin.intranet.model.Device;

public interface DeviceRepository extends JpaRepository<Long, Device> {
}
