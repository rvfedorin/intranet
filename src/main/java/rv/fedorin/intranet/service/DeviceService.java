package rv.fedorin.intranet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rv.fedorin.intranet.repository.DeviceRepository;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;
}
