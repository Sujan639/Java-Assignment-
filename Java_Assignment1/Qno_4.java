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
import java.util.Scanner;
public class Q4 {
    static void finder(int a,int b,int c){
        if(a>b){
            if(c>b){
                 System.out.println("Smallest numbet is:"+b);
            }
            else{
                System.out.println("Smallest number is:"+c);
            }
        }
        else if(c>a){
            System.out.println("Smallest number is:"+a);
        }
        else{
            System.out.println("Smallest number is:"+c);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        System.out.println("Enter third number:");
        int c=s.nextInt();
        finder(a,b,c);
    }
}
