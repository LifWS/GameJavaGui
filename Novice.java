import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Novice {

   private String Name = "";
   private int LV = 1;
   private int HP = 500;
   private int EXP = 0;
   public int SD = 200;
   public int ATK = 50;
   public int DEF = 60; // it's the panopl
   

   public String getName() {
       return Name;
   }
   public int getLV() {
    return LV;
   }
   public int getHP() {
    return HP;
   }
   public int getEXP() {
        return EXP;
   }

   public void setName(String Name) {
    this.Name = Name;
   }
   public void setLV(int LV) {
    this.LV = LV;
   }
   public void setHP(int HP) {
    this.HP = HP;
   }
   public void setEXP(int EXP) {
    this.HP = EXP;
   }
    public void attMoster() {
        System.out.println("Moster was DEATED!!");
        Random  r = new Random();
        HP = HP - r.nextInt(100);
        SD = SD - r.nextInt(30);
        DEF = DEF - r.nextInt(20);
    }
    public void showStatus(){
        System.out.println("----------------------");
        System.out.println("Status ");
        System.out.println("Name :"+Name);
        System.out.println("LV :"+LV);
        System.out.println("HP :"+HP);
        System.out.println("SD :"+SD);
        System.out.println("ATK :"+ATK);
        System.out.println("DEF :"+DEF);
        System.out.println("----------------------");
    }
    public void changClass(){
        System.out.println("----------------------");
        System.out.println("[1]Acholyte");
        System.out.println("[2]Magician");
        System.out.println("[3]Swordsman");
        System.out.println("----------------------");
        //System.out.println(HP);
    }
    public void Acholyte() {
        System.out.println("I am Acholyte");
        HP = HP + 100;
        SD = SD + 200;
        ATK = ATK + 100;
        DEF = DEF + 100;
    }
    public void Magician() {
        System.out.println("I am Magician");
        HP = HP + 100;
        SD = SD + 300;
        ATK = ATK + 80;
        DEF = DEF + 80;
    }
    public void Swordsman() {
        System.out.println("I am Swordsman");
        HP = HP + 150;
        SD = SD + 100;
        ATK = ATK + 250;
        DEF = DEF + 100;
    }

    public void callItemHP(){
        int h = Item.upBlood();
        HP = HP + h;
    }
    public void callItemSD(){
        int m = Item.upMana();
        HP = HP + m;
    }
    public void useShirts(){
        int m = Shirts.upDEF;
        DEF = DEF + m;
    }
    public void guiGameEnd5(){
		JFrame frame = new JFrame("My Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
        JButton button = new JButton("\n[Name :]"+Name +"\n___[LV :]"+LV+"\n___[HP :]"+HP+"\n___[SD :]"+SD+"\n___[ATK :]"+ATK+"\n___[DEF :]"+DEF);
        
		button.addActionListener(new MyActionListener());
		frame.add(button);
		
		frame.setVisible(true);
	}
}