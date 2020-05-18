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

public class Q11 {
    static void ArithmeticEx(){
        try {
            int a=0;
            if(a==0){
                throw new ArithmeticException("Divide by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        }
    static void NullPointerEx(){
            String a=null;
        try {
            if ("one".equals(a)){
                System.out.println(a);
            }
            throw new NullPointerException("Null Pointer caught");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    static void ArrayOutOfBoundsEx(){
        try {
            int[] myNumbers={1,1,22};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    static void StringOutOfBoundsEx(){
        try {
            String s="12924938249";
            System.out.println(s.charAt(49));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    static void NumberFormatEx(){
        String s="223.55";
        try {
            int a=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ArithmeticEx();
        NullPointerEx();
        ArrayOutOfBoundsEx();
        StringOutOfBoundsEx();
        NumberFormatEx();
    }
}
