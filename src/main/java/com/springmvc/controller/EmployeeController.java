package com.springmvc.controller;
import com.springmvc.DAO.EmployeeImpl;
import com.springmvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/EmployeeController")
public class EmployeeController
{
    @Autowired
    EmployeeImpl employeeImpl;
    static List<Integer> L=null;
 @RequestMapping(value="/insert",method=RequestMethod.GET)
    public String InsertData(Model model)
    {
        Employee E=new Employee();
        model.addAttribute("employee", E);
        return "insert";

    }
@RequestMapping(value = "/SaveEmp",method=RequestMethod.POST )
    public String SaveEmp(@Valid @ModelAttribute("employee") Employee emp , BindingResult bs, Model model)
    {
        if(bs.hasErrors())
        {
            return "insert";
        }
        else {
            String result = employeeImpl.SaveEmp(emp);
            model.addAttribute("result", result);
           return "insert";
        }
    }
@RequestMapping("/Extract")
public String Extract(Model model)
{
    L= employeeImpl.getDepts();
    model.addAttribute("list",L);
    return "Extract";
}
@RequestMapping("/extractEmp")
    public String extractEmp(@RequestParam("deptno") String dno,Model model)
{
    List<Employee> LE=employeeImpl.getEmps(Integer.parseInt(dno));
    model.addAttribute("LEmp",LE);
    model.addAttribute("list",L);
    model.addAttribute("dno",dno);

    return "Extract";
}
//used to display update.jsp
@GetMapping("/update")
public ModelAndView Updatedata()
{
    System.out.println("get method");
    Employee E=new Employee();
    ModelAndView M=new ModelAndView();
    M.addObject("employee",E);
    M.setViewName("update");
    return M;
}
@PostMapping("/updateEmp")
public ModelAndView UpdateEmp(@RequestParam("empno") String eno,@RequestParam("ename") String en,@RequestParam("deptno") String dno)
{
   String s= employeeImpl.updateEmp(Integer.parseInt(eno),en, Integer.parseInt(dno));
    ModelAndView M=new ModelAndView();

    M.setViewName("redirect:/EmployeeController/extractemp/"+eno);
    return M;
}
//used with update.jsp  on blur of empno text box
    //used when we are selectin the radio in Extract.jsp

@GetMapping("/extractemp/{id}")
    public String extract(@PathVariable String id,Model model)
    {
       Employee E= employeeImpl.getEmployee(Integer.parseInt(id));
       model.addAttribute("employee",E);

       return "update";
    }




}
