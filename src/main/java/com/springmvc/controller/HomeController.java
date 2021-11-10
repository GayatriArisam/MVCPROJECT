package com.springmvc.controller;

import com.springmvc.pojo.Emp;
import com.springmvc.pojo.PersonalDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController
{
    @RequestMapping(value = "/home")
    public String home(Model model)
    {
        model.addAttribute("name","ABC");
        return "index";
    }
    @RequestMapping("/about")
    public String abc()
    {
        return "Sample";
    }

    @RequestMapping("/test")
    public String firstpage()
    {
        return "First";
    }
    @RequestMapping("/Listitems")
    public String Listpage(Model model)
    {
        List<String> L=new ArrayList<String>();
        L.add("One");
        L.add("Two");
        L.add("Three");
        model.addAttribute("list",L);
        return "Listitems";
    }
    @RequestMapping("/ListitemsJstl")
    public String ListpageJstl(Model model)
    {
        List<String> L=new ArrayList<String>();
        L.add("One");
        L.add("Two");
        L.add("Three");
        model.addAttribute("list",L);
        return "ListitemsJstl";
    }
    @RequestMapping("/displayList")
    public String displayList(Model model)
    {
        List<Emp> LE=new ArrayList<Emp>();
        LE.add(new Emp(1,"A",20));
        LE.add(new Emp(2,"B",22));
        LE.add(new Emp(3,"C",23));
        model.addAttribute("Lemp",LE);
        return "DisplayList";

    }
@RequestMapping("/sendStr")
public ModelAndView sendString()
{
    ModelAndView M=new ModelAndView();
    M.addObject("name","XYZ");
    List<String> L=new ArrayList<String>();
    L.add("One");
    L.add("Two");
    L.add("Three");
    M.addObject("LS",L);
    M.setViewName("Home");
    return M;
}
@RequestMapping("/display")
public String display()
{
    return "DisplayForm";
}
@RequestMapping("/getvalues")
public String getvalues(Model model,@RequestParam("empno") String eno,@RequestParam("ename") String empname)
{
    System.out.println(eno+ " "+empname);
model.addAttribute("empno",eno);
model.addAttribute("ename",empname);
    return "getvalues";
}
@RequestMapping("/MExample")
public String ModelExample(Model model)
{
    PersonalDetails P=new PersonalDetails();
    model.addAttribute("P",P);
    return "Personal";
}

    @RequestMapping("/GetPersonal")
    public String GetPersonal(Model model,@ModelAttribute("P") PersonalDetails P)
    {
        model.addAttribute("P",P);
        return "GetPersonal";
    }

    @RequestMapping(value = "/Samplepg")
    public String Sample()
    {

        return "Sample";
    }



}
