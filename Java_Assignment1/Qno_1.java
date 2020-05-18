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
public class Q1 {
    static int adder(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        System.out.println("Sum:"+adder(a,b));
    }
}
