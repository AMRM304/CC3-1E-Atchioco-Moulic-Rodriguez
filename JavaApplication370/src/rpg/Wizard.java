package rpg;
public class Wizard extends Character {
int  damage2;
int Maxmagic;
int Currentmagic;
int MagicAttack;
int heal;
int castLightningBolt = dice.roll() * super.intelligence;
     
     /** instance variables */
/**
* The Wizard(String,int,int,int) constructor overrides the
* constructor with the same signature in Character. It first
* calls that constructor using the super keyword, then
* initializes maxmagic to a value, and sets currentmagic to
* the same value, similar to lifepoints.
     * @param n
     * @param s
     * @param d
     * @param i
*/

public Wizard(String n, int s, int d, int i) {
super( n,  s,  d,  i);
Maxmagic=(this.intelligence*10)+10;
Currentmagic=Maxmagic;
}

    
/**
* castLightningBolt() represents casting a magic spell. The
* method first checks that currentmagic is greater than/equal
* to 5. If it is, currentmagic is reduced by 5 and a random
* number is returned using the dice inherited from Character,
* modified by the character's intelligence.
* Otherwise, returns 0.
     * @return 
*/
public void MagicAttack(int MagicAttack){
    MagicAttack = (dice.roll()*10+10);
    currentLife -= MagicAttack;
}

public int castLightningBolt() {
    if (Currentmagic>=5){
        this.MagicAttack=castLightningBolt+dice.roll();
    }
    return MagicAttack;
}
/**
* castHeal() represents casting a magic spell. The method first
* checks that currentmagic is greater than/equal to 8. If it
* is, currentmagic is reduced by 8 and the character's heal()
* method is called with a random number, modified by the
* character's intelligence score. The amount healed is also
* returned by the method.
*/


public int attack2(){
int attack=(dice.roll()*this.intelligence+10);
this.damage=attack;

return attack;
 }

public void wound(int damage) {
    damage  = dice.roll();
    currentLife -= castLightningBolt;
    
}

public int castHeal() {
   if(Currentmagic>=8){
     
   }
    return heal;
}
/**
* Returns maxmagic
*/
public int getMaxmagic() {
    
    return Maxmagic;
}
/**
* Returns currentmagic
*/
public int getCurrentmagic() {
    Currentmagic -= castLightningBolt;
    return Currentmagic;
}

    String MagicAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
