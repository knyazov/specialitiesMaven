package akzholedu.specialitiesmaven.repositories;


import akzholedu.specialitiesmaven.entities.Specialities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SpecialitiesRepository extends JpaRepository<Specialities, Long> {
}
