package com.springmvc.DAO;

import com.springmvc.pojo.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeImpl
{
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public String SaveEmp(Employee E)
    {
   try {
       String query = "insert into Employeep values(?,?,?,?,?)";
       jdbcTemplate.update(query, E.getEmpno(), E.getEname(), E.getGender(), E.getDob(), E.getDeptno());
       return "1 row inserted";
   }
   catch(Exception e) {
       if(e.getMessage().contains("employeep.PRIMARY"))
       {
           return "Employe no cannot be duplicate";
       }
       else if(e.getMessage().contains("employeep_chk_1"))
           return "Enter the gender correct";
       else
           return e.getMessage();


       }
    }
public List<Integer> getDepts()
{
    String query ="Select distinct deptno from employeep";
    List<Map<String,Object>> LM=getJdbcTemplate().queryForList(query);
    List<Integer> L=new ArrayList<Integer>();
    for(Map<String,Object> m:LM)
    {
        L.add((Integer)m.get("deptno"));

    }
    return L;
}
    public List<Employee> getEmps(int dno)
    {
        String query ="Select * from employeep where Deptno=?";
        List<Map<String,Object>> LM=getJdbcTemplate().queryForList(query,new Object[]{dno});
        List<Employee> L=new ArrayList<Employee>();
        Employee E=null;
        SimpleDateFormat F=new SimpleDateFormat("yyyy-MM-dd");
       try {
           for (Map<String, Object> m : LM) {
               E = new Employee();
               E.setEmpno((Integer) m.get("empno"));
               E.setEname((String) m.get("ename"));
               E.setGender((String) m.get("gender"));
               E.setDob(F.parse(m.get("dob").toString()));
               E.setDeptno((Integer) m.get("deptno"));
               L.add(E);
           }
       }
       catch(ParseException e)
       {

       }
        return L;
    }
    public Employee getEmployee(int eno)
    {
        Employee E = null;
           try {
            String query = "Select * from employeep where empno=?";
            Map<String, Object> M = getJdbcTemplate().queryForMap(query, new Object[]{eno});
            SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");
            E = new Employee();
            E.setEmpno((Integer) M.get("empno"));
            E.setEname((String) M.get("ename"));
            E.setGender((String) M.get("gender"));
            E.setDob(F.parse(M.get("dob").toString()));
            E.setDeptno((Integer) M.get("deptno"));
        } catch (ParseException e) {
        }
        return E;
    }
public String updateEmp(int empno,String ename,int deptno)
{
    String query="update employeep set ename=?,deptno=? where empno=?";
    int R=jdbcTemplate.update(query,ename,deptno,empno);
    if(R==1)
        return "1 row updated";
    else
        return "No rows updated";

}
    }


