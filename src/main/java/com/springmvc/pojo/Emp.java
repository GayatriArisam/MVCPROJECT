package com.springmvc.pojo;

public class Emp {
    int empno;
    String ename;
    int age;

    public Emp(int empno, String ename, int age) {
        this.empno = empno;
        this.ename = ename;
        this.age = age;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


}
