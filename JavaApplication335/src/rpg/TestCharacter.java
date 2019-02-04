package rpg;

public class TestCharacter {
    static Dice dice = new Dice();
    public static void main(String[] args){
        String name="Sir Warren";
        int strength =dice.roll();
        int dexterity = 0;
        int intelligence = 0;
        
        Character p1= new Character( name, strength, dexterity, intelligence);
        String name2="Sir Pati";
        int strength2 =dice.roll();
        int dexterity2 = 0;
        int intelligence2 = 0;
        
        
         System.out.println("------Dice Roll------");
        
        Character p2= new Character(name2, strength2, dexterity2, intelligence2);
        for (int at=1; at<100;at++){
            System.out.println();
            System.out.println("⚃ Round " +at +" ⚃");
            System.out.println(name+": "+ p1.getCurrentLife());
            System.out.println(name2+": "+ p2.getCurrentLife());
            int p1attack=p1.attack();
            int p2attack=p2.attack();
            System.out.println(name+" attacks "+name2+" for "+p1attack);
            System.out.println(name2+" attacks "+name+" for "+p2attack);
            p1.wound(p2attack);
            p2.wound(p1attack);
           System.out.println();
           
            if(p1.getCurrentLife()<0 && p2.getCurrentLife()<0) {
            	p1.setCurrentLife(0);
            	p2.setCurrentLife(0);
                 System.out.println("Final Life");
            	System.out.println(name+": "+p1.getCurrentLife());
                System.out.println(name2+": "+p2.getCurrentLife());
                System.out.println("DRAW!");
                System.out.println("----- BETTER LUCK NEXT TIME :D -----");
                System.out.println();
                break;
            }
            else if (p1.getCurrentLife()<0){
            	p1.setCurrentLife(0);
                 System.out.println("-----Final Life-----");
            System.out.println(name+": "+p1.getCurrentLife());
            System.out.println(name2+": "+p2.getCurrentLife());
            System.out.println();
            System.out.println("----- CONGRATS -----");
            System.out.print(name2+" YOU WON THE DUEL!");
            
          
            break;
            
            }
            
            else if (p2.getCurrentLife()<0){
            	System.out.println();
                p2.setCurrentLife(0);
             System.out.println("------Final Life------");
            System.out.println(name+": "+p1.getCurrentLife());
            System.out.println(name2+": "+p2.getCurrentLife());
            System.out.println();
             System.out.println("----- CONGRATS ♥ -----");
            System.out.print(name+" YOU WON THE DUEL!");
          
            break;
            }
        }

    }
}
    