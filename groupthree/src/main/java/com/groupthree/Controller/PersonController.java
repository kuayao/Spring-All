package com.groupthree.Controller;

import com.groupthree.bean.Person;
import com.groupthree.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/9/22.
 */
@Controller
public class PersonController {


    @Autowired
    private PersonService personService;

   @RequestMapping("/getAllPerson")
    public  String getAllPerson(Model model){
       List<Person> people = personService.getAllPerson();

       model.addAttribute("people",people);
       return ("list");

    }
}
