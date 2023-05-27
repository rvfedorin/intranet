package rv.fedorin.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rv.fedorin.intranet.model.Port;

public interface PortRepository extends JpaRepository<Long, Port> {
}
