/*
PACKAGE POS SD
 */
package main;


public class Suppliers {
    private String supId;
    private String supName;
    private String supAddress;
    private String email;
    private String phone;
    
    public Suppliers(String supId,String supName,String supAddress,String email,String phone) {
        this.supId = supId;
        this.supName = supName;
        this.supAddress = supAddress;
        this.email=email;
        this.phone=phone;
       
    }
    
    public String getsupId() {
        return supId;
    }

    public void setsupId(String supId) {
        this.supId = supId;
    }

    public String getsupName() {
        return supName;
    }

    public void setsupName(String supName) {
        this.supName = supName;
    }

    public String getsupAddress() {
        return supAddress;
    }

    public void setsupAddress(String supAddress) {
        this.supAddress = supAddress;
    }    
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    } 
    
    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    } 
    
   

}

