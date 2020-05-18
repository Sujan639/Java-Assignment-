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
public class Q3 {
    static float si(float p,float t,float r){
        return((p*t*r)/100);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        float p=s.nextFloat();
        System.out.println("ENter time period:");
        float t=s.nextFloat();
        System.out.println("Enter interest rate:");
        float r=s.nextFloat();
        System.out.println("Simple Interest amount:"+si(p,t,r));
    }
   
}
