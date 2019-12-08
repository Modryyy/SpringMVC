package pl.edu.wszib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.db.DBConnector;
import pl.edu.wszib.model.Pytanie;

@Controller
public class PytaniaController {




    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage(){
        return new ModelAndView("home", "pytaniaKey", new Pytanie());
    }


    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String HomeForm(@ModelAttribute("pytaniaKey") Pytanie pytanie) {


        return "home";
    }

    @RequestMapping(value = "/addquestion", method = RequestMethod.GET)
    public ModelAndView AddPage(){
        return new ModelAndView("addquestion", "pytaniaKey", new Pytanie());
    }


    @RequestMapping(value = "/addquestion", method = RequestMethod.POST)
    public String AddForm(@ModelAttribute("pytaniaKey") Pytanie pytanie) {


        System.out.println(pytanie);
        Pytanie pytanie1 = new Pytanie();
        pytanie1 = pytanie;
        DBConnector.addQuestion(pytanie1);

        return "redirect:home";
    }
    @RequestMapping(value = "/getallquestion", method = RequestMethod.GET)
    public String usersPage(Model model){

        model.addAttribute("questionlist",DBConnector.getAllQuestions());
        return "getallquestion";
    }

    @RequestMapping(value = "/removequestion", method = RequestMethod.GET)
    public ModelAndView removePage(){
        return new ModelAndView("removequestion", "pytaniaKey", new Pytanie());
    }


    @RequestMapping(value = "/removequestion", method = RequestMethod.POST)
    public String removeForm(@ModelAttribute("pytaniaKey") Pytanie pytanie) {


        DBConnector.removeQuestion(pytanie.getIdPytania());

        return "redirect:home";
    }

    @RequestMapping(value = "/updatequestion", method = RequestMethod.GET)
    public ModelAndView updateQuest(){
        return new ModelAndView("updatequest", "pytaniaKey", new Pytanie());
    }


    @RequestMapping(value = "/updatequestion", method = RequestMethod.POST)
    public String updateQuestion(@ModelAttribute("pytaniaKey") Pytanie pytanie) {


        System.out.println(pytanie);

        DBConnector.updateQuestionSpecial(pytanie.getIdPytania(),pytanie);

        return "redirect:home";
    }
}


