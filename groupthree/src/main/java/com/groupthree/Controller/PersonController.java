package com.groupthree.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.groupthree.bean.Person;
import com.groupthree.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2019/9/22.
 */
@Controller
public class PersonController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

   @RequestMapping("/getAllPerson")
    public  String getAllPerson(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
       PageHelper.startPage(pageNum,5);
       List<Person> people = personService.getAllPerson();
       PageInfo<Person> pageInfo = new PageInfo<Person>(people);
       model.addAttribute("pageInfo",pageInfo);
       logger.info(pageInfo.toString());
       return ("list");

    }
}
