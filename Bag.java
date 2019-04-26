import java.util.Scanner;
import java.util.Random;

public class Bag{
    //Item useItem = new Item();
    
    public int MONEY = 0;
    public int EXP = 0;
    Shirts shirts = new Shirts();
    Sword sword = new Sword();
    Item item = new Item();

    public int getMoney(int MONEY){
        Random r = new Random();
        return r.nextInt(200)+50;  // 50-250
    }

    public int getExp(int EXP){
        Random r = new Random();
        return r.nextInt(100)+50;
    }
    
    public int useShirts(){
        return shirts.upDEF;
    }
    public int useSword(){
        return sword.upATK;
    }
    public void printSword(){
        System.out.println("Sword : ATK + "+sword.upATK);
    }
    public void printShirts(){
        System.out.println("Shirts : DFF + "+ Shirts.upDEF);
    }
}
