package com.groupthree.service.impl;

import com.groupthree.bean.Person;
import com.groupthree.dao.PersonMapper;
import com.groupthree.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/9/22.
 */

@Service
public class PersonServiceImpl  implements PersonService{

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> getAllPerson() {
        return personMapper.selectByExample(null);
    }
}
