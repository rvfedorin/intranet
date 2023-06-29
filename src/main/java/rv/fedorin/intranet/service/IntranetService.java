package rv.fedorin.intranet.service;


import rv.fedorin.intranet.model.Region;

/**
 * Сервис по работе с интранетом.
 */
public interface IntranetService {

    /**
     * Получить цепочку подключений до указанного IP.
     *
     * @param ipDevice - IP устройства, до которого строим цепочку подключения
     * @param region   - регион {@link Region}, в котором находится устройство
     * @return - цепочка подключения с портами
     */
    String getFullPath(String ipDevice, Region region);

    String allConnectionFromSwitch(String switchIP, boolean onlySw);

    String findClient(String mnemokod);
}
