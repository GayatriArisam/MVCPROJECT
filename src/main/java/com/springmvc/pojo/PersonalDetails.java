package com.springmvc.pojo;

public class PersonalDetails
{
    int id;
    String name;
    String gender;
    String pancard;
    String qualification;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int pid) {
        this.id = pid;
    }


}
