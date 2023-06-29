package rv.fedorin.intranet.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rv.fedorin.intranet.service.IntranetService;
import rv.fedorin.intranet.service.RegionService;
import rv.fedorin.intranet.web.dto.FullPathDto;


@Slf4j
@RestController
@RequestMapping("/intranet")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IntranetController {

    IntranetService intranetService;

    RegionService regionService;

    @GetMapping("/path/full")
    public String getFullPathForm() {
        log.debug("[GET] Create a full path form.");

        return regionService.getAll().toString();
    }

    @PostMapping("/path/full")
    public String getFullPath(@ModelAttribute("fullPathForm") FullPathDto fullPathForm) {
        log.debug("[POST] Get full path.");
        log.debug("Has data: " + fullPathForm);
        String path = "";

        if (isCorrectData(fullPathForm)) {
            var region = fullPathForm.getRegion();
            var ipDevice = fullPathForm.getIpDevice();
            path = intranetService.getFullPath(ipDevice, region);

            log.debug("PATH: " + path);
        }

        return path;
    }

    private boolean isCorrectData(FullPathDto fullPathForm) {
        return fullPathForm != null && fullPathForm.getIpDevice() != null && fullPathForm.getRegion() != null;
    }
}
