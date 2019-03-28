/*
 * Lewis White
 * March 22, 2019
 * This program will simulate an ATM
 */
package mybankmachine;

import java.util.Scanner;

/**
 *
 * @author lewhi7273
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get the name of the bank
        Scanner input = new Scanner(System.in);
        String bank;
        double initial;
        System.out.println("What is the name of the bank are you with?: ");
        bank = input.nextLine();
        System.out.println("What is your initial balance?: ");
        initial = input.nextDouble();
        
        int choice = 0;
        System.out.println("Enter your choice:\n 1.Deposit\n 2.Withdraw\n 3.See your current daily interest value");
        choice = input.nextInt();
                //deposit statement
            if(choice == 1){
                System.out.println("How much would you like to deposit?: ");
                 double depo = input.nextDouble();
                ATM deposit = new ATM(bank, initial,depo);
                
                System.out.println(deposit.deposit());
                //withdraw statement
            }else if (choice == 2){
                int throwaway = 0;
                System.out.println("How much would you like to withdraw?: ");
                double withdra = input.nextDouble();
                ATM withdraw = new ATM(bank,initial,withdra,throwaway);
                
                System.out.println(withdraw.withDraw());
                //intrest rate statement
            }else if (choice == 3){
                System.out.println("What is the annual intrest rate?: ");
                double intrst = input.nextDouble();
                System.out.println("How many days have you had the money in the bank?: ");
                int days = input.nextInt();
                ATM balance = new ATM(days , intrst , initial);
                
                System.out.println(balance.dailyIntrest());
            }else{
                System.out.println("Please retry! Choose between options 1 and 3");
            }
    }
    
}
