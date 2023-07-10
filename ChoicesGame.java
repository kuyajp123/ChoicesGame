package com.mycompany.firstJava;

/**
 *
 * @author Naag
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ChoicesGame {
	public static void main(String[] args)throws IOException{
	Scanner sc = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        JOptionPane.showMessageDialog(null,"Hi! Welocome to my project\n I'm John Paul Naag and this is my\n first project in java.");
        while(true){
        String input = JOptionPane.showInputDialog("1 = ROCK, PAPER, SCISSOR \n2 = ATM \n3 = Fast food\n4 = Calculator\n5 = to Quit\n Choose you want to play: ");       
        int user = Integer.parseInt(input);
        
        
            
            
        //1ST CHOICE ROCK PAPER SCISSOR
        if(user == 1){
        JOptionPane.showMessageDialog(null,"Rock, Paper, Scissor");
        for(int i = 1; i >= 1; i++){
        JOptionPane.showMessageDialog
        (null,"Enter a choice \n   R/r = Rock\n   P/p = Paper\n  S/s = Scissor\n press Q/q to quit ");
        String input1 = JOptionPane.showInputDialog("Player 1: ");
        char p1 = input1.charAt(0);
        String input2 = JOptionPane.showInputDialog("Player 2: ");
        char p2 = input2.charAt(0);
        
        
        //rock vs scissor
        if(p1 == 'R' || p1 == 'r'){
           if (p2 == 'S' || p2 == 's'){
           JOptionPane.showMessageDialog(null,"Player 1 win");
           }else if(p2 == 'R' || p2 == 'r'){
               JOptionPane.showMessageDialog(null,"Draw");
           }
               
        }else if(p1 == 'S' || p1 == 's'){
           if (p2 == 'R' || p2 == 'r'){
           JOptionPane.showMessageDialog(null,"Player 2 win");
            }            
            
        
        
        // rock vs paper
        }else if(p1 =='P' || p1 == 'p'){
            if(p2 == 'R' || p2 == 'r'){
                JOptionPane.showMessageDialog(null,"Player 1 win");
            }else if(p2 == 'P' || p2 == 'p'){
                JOptionPane.showMessageDialog(null,"Draw");
            }
        }if(p1 =='R' || p1 == 'r'){
            if(p2 == 'P' || p2 == 'p'){
                JOptionPane.showMessageDialog(null,"Player 2 win");
            }
        }

        
        //paper vs scissor
        else if(p1 == 'S' || p1 == 's'){
            if(p2 == 'P' || p2 == 'p'){
                JOptionPane.showMessageDialog(null,"Player 1 win");
            }else if(p2 == 'S' || p2 == 's'){
                JOptionPane.showMessageDialog(null,"Draw");
            }
        }else if(p1 == 'P' || p1 == 'p'){
            if(p2 == 'S' || p2 == 's'){
                JOptionPane.showMessageDialog(null,"Player 2 win");
            }
        }else if(p1 == 'Q' || p1 == 'q'){           
                JOptionPane.showMessageDialog(null,"Bye");
                break;
        }else
            JOptionPane.showMessageDialog(null,"INVALID PAMATO");
        }
        
        
        
        
        //ATM
        }else if(user == 2){
        int bal = 1000;
        JOptionPane.showMessageDialog
        (null,"Welcome to ATM\nWhat do you want?\n1 = Withdraw\n2 = Deposit\n3 = Balance\n4 = Quit");
        while(true){
        String input2 = JOptionPane.showInputDialog(null,"What do you want?\n1 = Withdraw\n2 = Deposit\n3 = Balance\n4 = Quit\nEnter you want: ");
        int choi1 = Integer.parseInt(input2);
        
        //withdraw
        if(choi1 == 1){
            String input3 = JOptionPane.showInputDialog("Enter amount to withdraw: ");
            int with = Integer.parseInt(input3);
            if(with >= 1 && with <= bal){
            bal = bal-with;
            JOptionPane.showMessageDialog(null,"You withdraw: " + with);
            }else
                JOptionPane.showMessageDialog(null,"Insuficient amount");
        //deposit        
        }else if(choi1 == 2){           
            String input4 = JOptionPane.showInputDialog("Enter amount to deposit: ");
            int dep = Integer.parseInt(input4);         
                if(dep >= 1){
                bal = bal + dep;
                JOptionPane.showMessageDialog(null,"You deposit: " + dep);
                }else
                    JOptionPane.showMessageDialog(null,"Insuficient amount");
                
        //        
        }else if(choi1 == 3){
            JOptionPane.showMessageDialog(null,"You have " + bal + " in your account.\n");
        }else if(choi1 == 4){
            JOptionPane.showMessageDialog(null,"Thank you");
            break;
        }else
            JOptionPane.showMessageDialog(null,"INVALID\n");                             
        }     
        
        
        
        //Fast food
        
        }else if(user == 3){
            int bal = 0;
            int YummyBurger = 0;
            int JabiSpag = 0;
            int JabiChicken = 0;
            int FrechPatatas = 0;
            int JabiFloat = 0;
            
            JOptionPane.showMessageDialog(null,"Welcome to Jabili");
            while(true){                
            String input1 = JOptionPane.showInputDialog
        ("1 - YummyBurger = P50\n2 - Jabi Spag = P100\n3 - Jabi Chicken = P150\n4 - Frech Patatas = P50\n5 - Jabi Float = 70\n6 - STOP ORDER\nYour choice: ");
            int choi2 = Integer.parseInt(input1);
            
            if(choi2 == 1){
                YummyBurger++;
                bal = bal+50;
            }else if(choi2 == 2){
                JabiSpag++;
                bal = bal+100;
            }else if(choi2 == 3){
                JabiChicken++;
                bal = bal+150;
            }else if(choi2 == 4){
                FrechPatatas++;
                bal = bal+50;
            }else if(choi2 == 5){
                JabiFloat++;
                bal = bal+70;
            }else if(choi2 == 6){
                JOptionPane.showMessageDialog(null,"Thank you");
                break;
            }else{
                JOptionPane.showMessageDialog(null,"INVALID");
            }  
           
           }
            
           if(YummyBurger>0 || JabiSpag>0 || JabiChicken>0 || FrechPatatas>0 || JabiFloat>0){
               JOptionPane.showMessageDialog
        (null,"Your order:\n" + YummyBurger+" Yummy Burger\n" + JabiSpag +
         " Jabi Spag\n" + JabiChicken+" Jabi Chicken\n" + FrechPatatas+" Frech Patatas\n" + JabiFloat+" Jabi Float\n");
           }    
            JOptionPane.showMessageDialog(null,"total P"+ bal);           
                
            
        //Calculator    
        }else if(user == 4){
            JOptionPane.showMessageDialog(null, """
                                                Welcome to calculator
                                                
                                                Select operator (+, -, *, /, %)
                                                
                                                Press S/s to Stop""");           
            for(int i = 1; i >= 1; i++){
            input = JOptionPane.showInputDialog("Enter opperator: ");
            char ope = input.charAt(0);
            
          if(ope == '+'){
              String input1 = JOptionPane.showInputDialog("Enter 1st number: ");
              int num1 = Integer.parseInt(input1);
              String input2 = JOptionPane.showInputDialog("Enter 2nd number: ");
              int num2 = Integer.parseInt(input2);              
              JOptionPane.showMessageDialog(null,num1 + " + " + num2 + " = " + (num1 + num2));
              i--;             
            }else if(ope == '-'){
              String input1 = JOptionPane.showInputDialog("Enter 1st number: ");
              int num1 = Integer.parseInt(input1);
              String input2 = JOptionPane.showInputDialog("Enter 2nd number: ");
              int num2 = Integer.parseInt(input2);              
              JOptionPane.showMessageDialog(null,num1 + " - " + num2 + " = " + (num1 - num2));
              i--;
            }else if(ope == '*'){
              String input1 = JOptionPane.showInputDialog("Enter 1st number: ");
              int num1 = Integer.parseInt(input1);
              String input2 = JOptionPane.showInputDialog("Enter 2nd number: ");
              int num2 = Integer.parseInt(input2);              
              JOptionPane.showMessageDialog(null,num1 + " * " + num2 + " = " + (num1 * num2));
              i--;
            }else if(ope == '/'){
              String input1 = JOptionPane.showInputDialog("Enter 1st number: ");
              int num1 = Integer.parseInt(input1);
              String input2 = JOptionPane.showInputDialog("Enter 2nd number: ");
              int num2 = Integer.parseInt(input2);              
              JOptionPane.showMessageDialog(null,num1 + " / " + num2 + " = " + (num1 / num2));
              i--;
            }else if(ope == '%'){
              String input1 = JOptionPane.showInputDialog("Enter 1st number: ");
              int num1 = Integer.parseInt(input1);
              String input2 = JOptionPane.showInputDialog("Enter 2nd number: ");
              int num2 = Integer.parseInt(input2);              
              JOptionPane.showMessageDialog(null,num1 + " % " + num2 + " = " + (num1 % num2));
              i--;
            }else if(ope == 'S' || ope == 's'){
              JOptionPane.showMessageDialog(null,"Thank you ");
              break;
            }else
                JOptionPane.showMessageDialog(null,"Invalid");  
            }
            
            
            
         //Quit program   
        }else if(user == 5){
            JOptionPane.showMessageDialog(null,"Thank you!");
            break;
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Please input again");
        }
        
        
        
        
        
        
        
        
        
        //game choices while true
        }
        
        }
        
    }

