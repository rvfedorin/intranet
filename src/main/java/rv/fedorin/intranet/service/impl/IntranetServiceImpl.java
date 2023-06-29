package rv.fedorin.intranet.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;
import rv.fedorin.intranet.model.Region;
import rv.fedorin.intranet.service.IntranetService;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IntranetServiceImpl implements IntranetService {

    private static final Pattern IP_PATTERN = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    private static final Pattern CONNECT_FROM_PATTERN = Pattern.compile("(\\d{1,2}).*?(" + IP_PATTERN + ").*?(\\d{1,2})");
    private static final String SEPARATOR_CONNECTION = "<=>";

//    ConfigurationRepository configurationRepository;

    @Override
    public String getFullPath(String ipDevice, Region region) {
//        log.debug("Getting full path to IP: {} in region: {}", ipDevice, region.getName());
//        var sheet = getExcelList(region);
//
//        return findConnections(ipDevice, region, sheet);
        return Strings.EMPTY;
    }

    @Override
    public String allConnectionFromSwitch(String switchIP, boolean onlySw) {
        return null;
    }

    @Override
    public String findClient(String mnemokod) {
        return null;
    }

//    private String findConnections(String ipLookingForDevice, Region region, HSSFSheet sheet) {
//        StringBuilder connect = new StringBuilder();
//        Iterator<Row> rows = sheet.rowIterator();
//        var cellDeviceId = region.getCellIpDeviceInIntranet();
//        var cellConnectionId = region.getCellUpConnectionInIntranet();
//        var ipCoreSwitch = region.getIpCoreSwitch();
//
//        while (rows.hasNext()) {
//            var row = rows.next();
//            var cellIpValue = getCellValue(cellDeviceId, row);
//
//            if (cellIpValue.equals(ipLookingForDevice)) {
//                // check if it is root sw
//                if (cellIpValue.equals(ipCoreSwitch)) {
//                    return String.format("[%d] %s(switch)", region.getPortConnectCisco(), ipCoreSwitch);
//                }
//
//                var cellConnectFromValue = getCellValue(cellConnectionId, row);
//                var connectionFrom = cellConnectFromValue.replaceAll("\\d/", ""); // if port is Gi0/18
//
////                Matcher ipMatcher = IP_PATTERN.matcher(cellIpValue);
//                Matcher connectedFromMatcher = CONNECT_FROM_PATTERN.matcher(connectionFrom);
//                // we found our ip and up connection
//                if (connectedFromMatcher.find()) {
//                    var upPort = connectedFromMatcher.group(1);
//                    var upIp = connectedFromMatcher.group(2);
//                    var thisDevicePortConnection = connectedFromMatcher.group(3);
////                    var myIp = ipMatcher.group();
//                    connect.append(findConnections(upIp, region, sheet))
//                            .append(" [").append(upPort).append("] ")
//                            .append(SEPARATOR_CONNECTION)
//                            .append(" [").append(thisDevicePortConnection).append("] ")
//                            .append(cellIpValue).append("(switch)");
//                } else {
//                    connect.append("[not found connection]")
//                            .append(ipLookingForDevice)
//                            .append("[not found in: ")
//                            .append(region.getName())
//                            .append("]");
//                }
//            }
//        } // ** while
//
//        if (connect.length() < 8) {
//            return "[Error] Broken path [[" + ipLookingForDevice + "]] [[" + region.getName() + "]]";
//        }
//        return connect.toString();
//    }
//
//    private String getCellValue(Integer cellId, Row row) {
//        return Optional.ofNullable(row)
//                .flatMap(r -> Optional.ofNullable(r.getCell(cellId))
//                        .map(Cell::getStringCellValue)
//                        .map(String::strip))
//                .orElse(Strings.EMPTY);
//    }
//
//    private Path getIntranetExcelFile(Region region) {
//        var config = configurationRepository.findAll()
//                .stream()
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("There is no configuration if DB."));
//
//        var pathUri = config.getIntranetsPath() + File.separator + region.getName();
//        var intranetNameXls = region.getName() + ".xls";
//        var intranetNameXlsx = region.getName() + ".xlsx";
//
//        try (Stream<Path> stream = Files.list(Path.of(pathUri))) {
//            return stream
//                    .filter(f -> !Files.isDirectory(f))
//                    .filter(f -> f.getFileName().toString().contains(intranetNameXls)
//                            || f.getFileName().toString().contains(intranetNameXlsx))
//                    .findFirst()
//                    .orElseThrow(() -> new FileNotFoundException("Intranet: '" + pathUri + intranetNameXls + "(xlsx)' not found."));
//        } catch (IOException exception) {
//            throw new IllegalStateException(exception);
//        }
//    }
//
//    private HSSFSheet getExcelList(Region region) {
//        var excelFile = getIntranetExcelFile(region);
//        try {
//            HSSFWorkbook workbook = new HSSFWorkbook(Files.newInputStream(excelFile));
//            return workbook.getSheetAt(0);
//        } catch (IOException e) {
//            throw new IllegalStateException("Can't open Intranet " + excelFile.getFileName());
//        }
//    }
}
