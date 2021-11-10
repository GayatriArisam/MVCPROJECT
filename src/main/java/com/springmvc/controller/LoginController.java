package com.springmvc.controller;
import com.springmvc.pojo.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value="/Login", method = RequestMethod.GET)
    public String login(Model model)
    {
    Login login=new Login();
    model.addAttribute("login",login);
    return "Login";
    }
    @RequestMapping(value="/doLogin",method=RequestMethod.POST)

public String doLogin(@Valid @ModelAttribute("login") Login login, BindingResult bs)
{
if(bs.hasErrors())
{
 System.out.println("hello");
 return "Login";
}
else
{
System.out.println(bs.hasErrors());
System.out.println(login.getUsername());
System.out.println(login.getEmail());
System.out.println(login.getPassword());
return "LoginSuccess";

}

}


}
