package rv.fedorin.intranet.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rv.fedorin.intranet.service.RegionService;
import rv.fedorin.operationservice.model.Region;
import rv.fedorin.operationservice.repository.RegionRepository;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RegionServiceImpl implements RegionService {

    RegionRepository regionRepository;

    @Override
    public List<Region> getAll() {
        var regions = regionRepository.findAll();
        log.debug("Getting regions: {}", regions);

        return regions;
    }

    @Override
    public Region findByNameIgnoreCase(String name) {
        var region = regionRepository.findByNameIgnoreCase(name);
        log.debug("Found a region: " + region);

        return region.orElseThrow(() -> new NoSuchElementException("Region not found: " + name));
    }

    @Override
    public Region findById(Long id) {
        var region = regionRepository.findById(id);
        log.debug("Found a region: " + region);

        return region.orElseThrow(() -> new NoSuchElementException("Region not found by id: " + id));
    }


}
