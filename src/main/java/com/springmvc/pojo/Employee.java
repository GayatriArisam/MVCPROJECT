package com.springmvc.pojo;
import javax.validation.constraints.*;
import java.util.Date;
public class Employee {
@Max(value = 10,message = "greater than 10")
@Min(value=0,message = "less than 0")

    int empno;
@Size(min = 4,max = 10,message = "size")
String ename;
@NotBlank(message = "cannot be blank")
    String gender;
    Date dob;  //MM/dd/yyyy
    int deptno;

    public Employee() {
    }


    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }


    public Employee(int empno, String ename, String gender, Date dob, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.gender = gender;
        this.dob = dob;
        this.deptno = deptno;
    }

   }
