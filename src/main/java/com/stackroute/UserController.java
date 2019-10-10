package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView userDate()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        User user =new User();
        user.setName("sanjay");
        mv.addObject("result",user);
        return mv;
    }

}
