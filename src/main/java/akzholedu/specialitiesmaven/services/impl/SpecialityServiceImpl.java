package akzholedu.specialitiesmaven.services.impl;

import akzholedu.specialitiesmaven.entities.QuizResult;
import akzholedu.specialitiesmaven.entities.SpecialityQuiz;
import akzholedu.specialitiesmaven.exceptions.ApiRequestException;
import akzholedu.specialitiesmaven.repositories.QuizResultRepository;
import akzholedu.specialitiesmaven.repositories.SpecialityQuizRepository;
import akzholedu.specialitiesmaven.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    @Autowired
    private SpecialityQuizRepository specialityQuizRepository;

    @Autowired
    private QuizResultRepository quizResultRepository;

    @Override
    public List<SpecialityQuiz> allQuestions() {
        return specialityQuizRepository.findAll();
    }

    @Override
    public QuizResult getQuizResult(String code) {
        if((quizResultRepository.findByCode(code))!=null)
        return quizResultRepository.findByCode(code);
        else throw new ApiRequestException("Cannot find");
    }

    @Override
    public List<QuizResult> allQuizResult() {
        return quizResultRepository.findAll();
    }
}
