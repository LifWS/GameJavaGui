import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp02 extends JFrame{
    
	public void guiGame(){
		JFrame frame = new JFrame("My Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		JButton button = new JButton("Start!!!");
		button.addActionListener(new MyActionListener());
		frame.add(button);
		
        frame.setVisible(true);
        //----------------------
        
	}
	
}


class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
        //Main m = new Main();
		System.out.println("----------------------");
        System.out.println("Welcome to [ WS GAME ] ");
		System.out.println("----------------------");
		Novice myChar = new Novice(); 
        Bag myBag = new Bag();
		
		
		Scanner Sc = new Scanner(System.in);
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
		System.out.println("----------------------");
        myChar.guiGameEnd5();
        new Main();
		
	}
}

	
