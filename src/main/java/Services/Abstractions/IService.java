package Services.Abstractions;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    T save(T entity);
    T update(Long id, T entity);
    void delete(Long id);
    Optional<T> findById(Long id);
    List<T> findAll();
}
