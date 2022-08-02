package akzholedu.specialitiesmaven.services;



import akzholedu.specialitiesmaven.entities.QuizResult;
import akzholedu.specialitiesmaven.entities.SpecialityQuiz;

import java.util.List;

public interface SpecialityService {
    List<SpecialityQuiz> allQuestions();
    QuizResult getQuizResult(String code);
    List<QuizResult> allQuizResult();
}
