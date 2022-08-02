package akzholedu.specialitiesmaven.repositories;


import akzholedu.specialitiesmaven.entities.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    QuizResult findByCode(String code);
}
