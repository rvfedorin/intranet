package rv.fedorin.intranet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rv.fedorin.intranet.repository.PortRepository;

@Service
@RequiredArgsConstructor
public class PortService {

    private final PortRepository portRepository;
}
