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
public class Staff extends Employee {
    private String title;


    public Staff(String title, String office, double salary, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n\ttitle=" + title;
    }
    
    
    
    
    
    
    
    
    
    
    
}
