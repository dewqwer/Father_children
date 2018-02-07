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
public class Driver {
    public static void main(String args[]){
        Student student1=new Student("A", "A", "A", "A", Student.Status.freshman);
        Person person1=new Person("B", "B", "B", "B");
        Faculty faculty1=new Faculty("C", "C", "C", 0, "C", "C", "C", "C");
        Staff staff1=new Staff("D", "D",1, "D", "D", "D", "D");
        
        System.out.println(student1.toString());
        System.out.println(student1.genEmail());

        System.out.println(person1.toString());
        System.out.println(person1.genEmail());
        
        System.out.println(faculty1.toString());
        System.out.println(faculty1.genEmail());
        
        System.out.println(staff1.toString());
        System.out.println(staff1.genEmail());
        
    }
    
}
