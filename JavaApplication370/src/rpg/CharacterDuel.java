/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class CharacterDuel {
static Dice dice = new Dice();
    static Dice dice2 = new Dice();
      
    public static void main(String[] args) {
        
       
        Character  Character = new Character("Carlo", dice.roll(),dice.roll(),dice.roll());
     
        Wizard Wizard2 = new Wizard ("Wizar Dave", dice2.roll(),dice2.roll(),dice2.roll());
        System.out.println("----WIZARD FIGHT----");
    
        
        boolean n = true;
        int i =1;
        while (n) {
            System.out.println();
            System.out.println("Round " + i);
            System.out.println("Carlo" + ": " + Character.getCurrentLife());
            System.out.println("Wizard Dave"+ ": " + Wizard2.getCurrentLife()); //Life Initialization\
           
           
            if (Character.getCurrentLife() <= 0 && Wizard2.getCurrentLife() <= 0) { // Draw
                Character.setCurrentLife(0);
                Wizard2.setCurrentLife(0);
                System.out.println("Final Life: ");
                System.out.println("Carlo" + ": " + Character.getCurrentLife());
                System.out.println("Wizard Dave" + ": " + Wizard2.getCurrentLife());
                System.out.println("DRAW!");
                break;

            }
               System.out.println("");
            System.out.println("Carlo" + " attacks " + "Wizard Dave" + " for " + Character.attack());//p1 attack
            Wizard2.currentLife -= Character.damage;
            if (Wizard2.currentLife <= 0) {
               Wizard2.currentLife = 0;
                System.out.println(" Wizard Dave can't fight anymore");
                System.out.println();
                break;
            }
         
             System.out.println("Dave Current Magic"+ ": " + Wizard2.getCurrentmagic());
            System.out.println("Wizard Dave" + " cast Ligtning Bolt to" + " Carlo"+ " for " + Wizard2.castLightningBolt());//p2attack
            Character.currentLife -= Wizard2.MagicAttack;
            if (Character.currentLife <= 0) {
                Character.currentLife = 0;
                System.out.println("Carlo can't fight anymore");
                System.out.println();
                break;
            }
            i++;
        }
        
            if (Character.currentLife > Wizard2.currentLife){
                System.out.println("Final Life");
                System.out.println("Carlo" + ": " + Character.getCurrentLife());
                System.out.println("Wizard Dave"+ ": " + Wizard2.getCurrentLife());
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.print("Carlo" + " YOU WON THE DUEL!");
            } else if (Wizard2.currentLife > Character.currentLife){
                System.out.println("");
                System.out.println("Final Life");
                System.out.println("Carlo"+ ": " +Character.getCurrentLife());
                System.out.println("Wizard Dave"+ ": " + Wizard2.getCurrentLife());
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.print("Wizard Dave" + " YOU WON THE DUEL!");
            }

    }
}


