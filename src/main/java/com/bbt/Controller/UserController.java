package com.bbt.Controller;

import com.bbt.Pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    User user = new User();

    @RequestMapping("/login")
    public String toString() {
        return "这是一个项目";
    }

    @RequestMapping("home")
    public String Home() {
        user.setUserId(1);
        user.setUsserName("我就是我");
        return user.toString();
    }

}
