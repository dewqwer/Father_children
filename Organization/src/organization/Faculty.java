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
public class Faculty extends Employee {
    private String officeHours;
    private String rank;


    public Faculty(String officeHours, String rank, String office, double salary, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tofficeHours: "+officeHours+"\n\trank: "+rank;
    }
    
    
    
    
}
