package com.groupthree.Controller;

import com.groupthree.bean.User;
import com.groupthree.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname :UserController
 * @program: groupThree
 * @description: User控制层
 * @author: HaiPangXia
 * @create: 2019-09-23 10:26
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @GetMapping("/getuser/{id}")
    public String GetUser(@PathVariable int id){
        User user = userService.Sel(id);
        logger.info("输出:"+ user.toString());
        return user.toString();
    }
}
