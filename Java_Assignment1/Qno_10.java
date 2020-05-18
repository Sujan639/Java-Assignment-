/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
interface eater{
    void eats();
}
interface drinker{
    void drinks();
}
class Human implements eater,drinker{

    @Override
    public void eats() {
        System.out.println("Human eats food");
    }

    @Override
    public void drinks() {
        System.out.println("Human drinks water");
    }
    
}
/**
 *
 * @author Ankur
 */
public class Q10 {
    public static void main(String[] args) {
        Human h=new Human();
        h.eats();
        h.drinks();
    }
}
