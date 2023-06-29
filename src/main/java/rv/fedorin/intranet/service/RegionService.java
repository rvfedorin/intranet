package rv.fedorin.intranet.service;

import java.util.List;
import rv.fedorin.operationservice.model.Region;

/**
 * Сервис работы с регионами.
 */
public interface RegionService {

    /**
     * Получить список регионов.
     *
     * @return список регионов {@link Region}
     */
    List<Region> getAll();

    /**
     * Найти регион по имени (без учёта регистра).
     *
     * @param name имя региона
     * @return найденный регион
     */
    Region findByNameIgnoreCase(String name);

    /**
     * Найти регион по id.
     *
     * @param id id региона
     * @return найденный регион
     */
    Region findById(Long id);
}
