package akzholedu.specialitiesmaven.repositories;

import akzholedu.specialitiesmaven.entities.Universities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UniversitiesRepository extends JpaRepository<Universities, Long> {
}
