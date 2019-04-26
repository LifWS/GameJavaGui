import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myGame {
    public static void main(String[] args) {
        /*Novice myChar = new Novice(); 
        Bag myBag = new Bag();
        
        //Main play = new Main();*/
        MyApp02 gui = new MyApp02();

        gui.guiGame();
        
        /*Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Charector: ");
        myChar.setName(Sc.nextLine());
        myChar.showStatus();
        System.out.println("ATTACK MOSTER !!!");
        myChar.attMoster();
        myChar.showStatus();
        System.out.println("You get EXP :"+myBag.getExp(myBag.EXP));
        System.out.println("You get MONEY :"+myBag.getMoney(myBag.MONEY));
        myChar.callItemHP();
        myChar.useShirts();
        
        myChar.changClass();
        Scanner scr = new Scanner(System.in);
        System.out.print("Pleas select class : ");
        int data = scr.nextInt();
        if (data == 1){
            myChar.Acholyte();
        }
        else if(data == 2){
            myChar.Magician();
        }
        else if(data == 3){
            myChar.Swordsman();
        }
        else if(data != 1 || data != 2 || data != 3){
            System.out.println("EROR!!");
        }
        
        System.out.println("----------------------");
        System.out.println("Finished chang class");
        myChar.showStatus();
        System.out.println("Descripe Item");
        myBag.printShirts();
        myBag.printSword();
        System.out.println("----------------------");*/
    }
}