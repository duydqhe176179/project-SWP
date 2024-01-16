/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Mentor {

    public int idMentor;
    String fullname;
    String avatar;
    String phone;
    String dob;
   
    String sex;
    String address;
    String registerDate;
    String profession;
    String pro_introduc;
    String archivement_sescition;
    String framework;
    String experience;
    String education;
    String myservice;
    int age;

    public Mentor() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mentor{" + "idMentor=" + idMentor + ", fullname=" + fullname + ", avatar=" + avatar + ", phone=" + phone + ", dob=" + dob + ", sex=" + sex + ", address=" + address + ", registerDate=" + registerDate + ", profession=" + profession + ", pro_introduc=" + pro_introduc + ", archivement_sescition=" + archivement_sescition + ", framework=" + framework + ", experience=" + experience + ", education=" + education + ", myservice=" + myservice + ", age=" + age + '}';
    }

    public Mentor(int idMentor, String fullname, String avatar, String phone, String dob, String sex, String address, String registerDate, String profession, String pro_introduc, String archivement_sescition, String framework, String experience, String education, String myservice, int age) {
        this.idMentor = idMentor;
        this.fullname = fullname;
        this.avatar = avatar;
        this.phone = phone;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.registerDate = registerDate;
        this.profession = profession;
        this.pro_introduc = pro_introduc;
        this.archivement_sescition = archivement_sescition;
        this.framework = framework;
        this.experience = experience;
        this.education = education;
        this.myservice = myservice;
        this.age = age;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

   

    public String getMyservice() {
        return myservice;
    }

    public void setMyservice(String myservice) {
        this.myservice = myservice;
    }

    public int getIdMentor() {
        return idMentor;
    }

   

    public void setIdMentor(int idMentor) {
        this.idMentor = idMentor;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPro_introduc() {
        return pro_introduc;
    }

    public void setPro_introduc(String pro_introduc) {
        this.pro_introduc = pro_introduc;
    }

    public String getArchivement_sescition() {
        return archivement_sescition;
    }

    public void setArchivement_sescition(String archivement_sescition) {
        this.archivement_sescition = archivement_sescition;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
