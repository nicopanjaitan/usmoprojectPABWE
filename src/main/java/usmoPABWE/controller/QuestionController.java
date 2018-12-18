package usmoPABWE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usmoPABWE.model.Question;
import usmoPABWE.service.QuestionService;

@Controller
public class QuestionController {

	private QuestionService questionService;
	
	//Karena diinjeksi menggunakan setter, maka diberikan autowired
	@Autowired
	public void setQuestionService (QuestionService questionService) {
		this.questionService = questionService;
	}
	
	@RequestMapping("/question")
	public String QuestionList(Model model) {
		model.addAttribute("question", questionService.listQuestion());
		return "question";
	}
	
	@RequestMapping(value = "/question/create", method = RequestMethod.GET)
	public String tampilkanForm (Model model) {
		model.addAttribute("question", new Question());
		return "formQuestion";
	}
	
	@RequestMapping(value = "/question/create", method = RequestMethod.POST)
	public String simpanDataQuestion (Model model, Question question) {
		model.addAttribute("question", questionService.saveOrUpdate(question));
		return "redirect:/question";
	}
	
	@RequestMapping(value= "/question/edit/{id}", method = RequestMethod.GET)
	public String updateDataQuestion (@PathVariable Integer id, Model model) {
		model.addAttribute("question", questionService.getId(id));
		return "formQuestion";
	}
	
	@RequestMapping(value= "/question/delete/{id}", method = RequestMethod.GET)
	public String deleteDataQuestion (@PathVariable Integer id) {
		questionService.deleteQuestion(id);
		return "redirect:/Question";
	}
}