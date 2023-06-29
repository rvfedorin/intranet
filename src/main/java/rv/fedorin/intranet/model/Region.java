package rv.fedorin.intranet.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Название ОП.
     */
    private String name;

    /**
     * Префикс в Clients.conf
     */
    private String prefix;


    /**
     * IP юникса.
     */
    private String ipUnix;

    /**
     * IP корневого свитча.
     */
    private String ipCoreSwitch;

    /**
     * IP корневого мобибокса.
     */
    private String ipCoreMb;

    /**
     * IP шлюза l2tp для клиентских МБ.
     */
    private String ipCustomersGatewayLanMb;

    /**
     * IP свитча подключения корневого мобибокса.
     */
    private String ipSwitchConnectMbUnnumbered;

    /**
     * Порт подключения данных мобибокса.
     */
    private Integer portMbData;

    /**
     * Номер ячейки в интранете, содержащей IP оборудования.
     */
    private Integer cellIpDeviceInIntranet;

    /**
     * Номер ячейки в интранете, содержащей IP и порты вышестоящего оборудования.
     */
    private Integer cellUpConnectionInIntranet;

    /**
     * Порт подключения циски.
     */
    private Integer portConnectCisco;

}
