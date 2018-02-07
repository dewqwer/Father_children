/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

/**
 *
 * @author INT105
 */
public class Student extends Person {
    public static enum Status{freshman,sophomore,junior,senior};
    public Status status; 
   
       
    public Student(String name,String address,String phoneNumber,String emailAddress,Status status){
        super(name, address, phoneNumber, emailAddress);
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.status=status;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tstatus: "+this.status;
    }
    
    
}
