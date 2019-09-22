package com.groupthree.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/22.
 */
@Controller
public class HiController {

    @RequestMapping("/hi")
    public  String hi(){
        return  "index";
    }
}
