package rv.fedorin.intranet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rv.fedorin.intranet.repository.DeviceTypeRepository;

@Service
@RequiredArgsConstructor
public class DeviceTypeService {

    private final DeviceTypeRepository deviceTypeRepository;
}
