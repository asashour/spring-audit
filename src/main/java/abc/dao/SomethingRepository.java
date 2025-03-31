package abc.dao;

import abc.entity.Something;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomethingRepository extends JpaRepository<Something, Long> {
}
