/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Ankur
 */
class Person{
    String name;
    Person(String a){
        name=a;
    }
}
class Politician extends Person{
    float salary;
    Politician(String a,float s){
        super(a);
        salary=s;
    }
}
class Sportsman extends Person{
    float salary;
    Sportsman(String a,float s){
        super(a);
        salary=s;
    }
}
public class Q7 {
    public static void main(String[] args) {
        Politician p=new Politician("One",1444);
        Sportsman s=new Sportsman("Two",2132);
        System.out.println("Name:"+p.name);
        System.out.println("Salary:"+p.salary);
        System.out.println("Name:"+s.name);
        System.out.println("Salary:"+s.salary);
    }
}
