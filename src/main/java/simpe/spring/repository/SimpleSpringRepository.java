package simpe.spring.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * @param <T> Entity (Table)
 * @param <K> PK
 */
@Repository
public interface SimpleSpringRepository<T, K> {
    List<T> findAll();

    Optional<T> findById(K id);

    void save(T t);
}
