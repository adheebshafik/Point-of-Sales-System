/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Per$ival
 */
public class Employee{
    private String empId;
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String enrollDate;
    private String leaveDate;
    private String post;
    private String basicSalary;
    private String bonus;
    private String EPF;
    private String ETF;
    private String password;
    
    
    public Employee(String empId,String fName,String lName,String address, String city,String enrollDate,String leaveDate,String post,String basicSalary,String bonus,String EPF,String ETF,String password){
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.address=address;
        this.city=city;
        this.enrollDate = enrollDate;
        this.leaveDate = leaveDate;
        this.post = post;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.EPF=EPF;
        this.ETF=ETF;
        this.password = password;
           
    }
    
    public String getId() {
        return empId;
    }

    public void setId(String empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }    
    
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    } 
    
    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    } 
    
    public String getenrollDate() {
        return enrollDate;
    }

    public void setenrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    } 
    
     public String getleaveDate() {
        return leaveDate;
    }

    public void setleaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    } 
    
    public String getpost() {
        return post;
    }

    public void setpost(String post) {
        this.post = post;
    } 
     
       public String getbasicSalary() {
        return basicSalary;
    }

    public void setbasicSalary(String basicSalary) {
        this.basicSalary =basicSalary ;
    } 
    
      public String getbonus() {
        return bonus;
    }

    public void setbonus(String bonus) {
        this.bonus=bonus;
    } 
    
        
      public String getEPF() {
        return EPF;
    }

    public void setEPF(String EPF) {
        this.EPF=EPF;
    } 
    
    
      public String getETF() {
        return ETF;
    }

    public void setETF(String ETF) {
        this.ETF=ETF;
    } 
    
        public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    } 

}
