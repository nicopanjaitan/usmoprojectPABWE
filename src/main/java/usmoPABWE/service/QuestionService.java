package usmoPABWE.service;

import java.util.List;

import usmoPABWE.model.Question;

public interface QuestionService {

	List<Question> listQuestion();
	
	//saveOrUpdate digunakan untuk method save dan update
	Question saveOrUpdate (Question question);
	
	Question getId(Integer id);
	
	void deleteQuestion(Integer id);
}