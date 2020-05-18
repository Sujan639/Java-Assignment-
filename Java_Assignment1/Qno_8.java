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

public class Q8 {
    static void one(){
        try {
            int[] myNumbers={12,44,22};
            System.out.println(myNumbers[55]);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
    }
    static void two(){
        try{
            int a=0;
            if(a==0){
                throw new ArithmeticException("Divide by zero");
            }
            System.out.println(8/a);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
        finally{
            System.out.println("Divide by something else");
        }
    }
    public static void main(String[] args) {
        one();
        two();
        }
    }

