/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.util.Scanner;
/**
 *
 * @author Ankur
 */
interface Employee{
    public void calsalary();
    public void getsalary();
}
class Manager implements Employee{
    int salary,bonus;
    @Override
    public void calsalary() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=s.nextInt();
        System.out.println("Enter bonus:");
        bonus=s.nextInt();
    }

    @Override
    public void getsalary() {
        System.out.println("Overall payment:"+(salary+bonus));
    }
    
}
class Clerk implements Employee{
    int salary,commission;
    @Override
    public void calsalary() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=s.nextInt();
        System.out.println("Enter commission:");
        commission=s.nextInt();
    }

    @Override
    public void getsalary() {
        System.out.println("Overall payment:"+(salary+commission));
    }
    
}
public class Q9 {
    public static void main(String[] args) {
        Clerk c=new Clerk();
        Manager m=new Manager();
        c.calsalary();
        c.getsalary();
        m.calsalary();
        m.getsalary();
    }
}
