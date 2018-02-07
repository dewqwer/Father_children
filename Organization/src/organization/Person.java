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
public class Person {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String genEmail() {
        return this.name.toLowerCase()+"@sit.kmutt.ac.th";

    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + '}';
    }

}
