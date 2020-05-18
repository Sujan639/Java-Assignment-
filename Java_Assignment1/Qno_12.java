/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.util.Random;
/**
 *
 * @author Ankur
 */
class NumberSort extends Thread{
    Random rand=new Random();
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
    int rand_int;
    public void gen(){
        rand_int=-50+rand.nextInt(100);
        System.out.println("Number is:"+rand_int);
    }
    public void getval(){
        if (rand_int<0){
            System.out.println("Number is negative");
        }
        else{
            getval2();
        }
    }
    public void getval2(){
        if(rand_int%2==0){
            System.out.println("Number is positive even");
        }
        else{
            System.out.println("Number is positive odd");
        }
    }
}
public class Q12 {
    public static void main(String[] args) {
        NumberSort t1=new NumberSort();
        NumberSort t2=new NumberSort();
        NumberSort t3=new NumberSort();
        t1.start();
        t2.start();
        t3.start();
        t1.gen();
        t2.gen();
        t3.gen();
        t1.getval();
        t2.getval();
        t3.getval();
    }
    
}
