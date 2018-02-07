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
public class Employee extends Person {
    protected String office;
    protected double salary;

    public Employee() {
    }


    public Employee(String office, double salary, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    @Override
    public String toString() {
            return super.toString()+"\n\toffice: "+office+"\n\tsalary: "+salary;
        }
    
    
    
    
    
    
    
}
