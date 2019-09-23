package com.groupthree.bean;

import lombok.Data;

/**
 * @classname :User
 * @program: groupThree
 * @description: UserDto
 * @author: HaiPangXia
 * @create: 2019-09-23 10:18
 **/
@Data
public class User {

    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

}
