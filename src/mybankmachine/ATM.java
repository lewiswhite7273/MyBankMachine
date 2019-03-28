package mybankmachine;

/**
 *
 * @author lewhi7273
 */
public class ATM {
    private String bankName;
    private int numberOfDays, choice;
    private double deposit, withdraw,dailyIntrest;
    private double currentBal = 0;
    
    
    //deposit
    public ATM(String bnkName, double amnt, double depos){
        amnt = currentBal;
        bnkName = bankName;
        depos = deposit;
    }
    //withdraw
    public ATM(String bnkName, double amnt, double withdra , int yep){
        currentBal = amnt;
        bankName = bnkName;
        withdraw = withdra;
    }
    //see current daily intrest
    public ATM(int day, double intrest , double amnt){
        numberOfDays = day;
        dailyIntrest = intrest;
        amnt = currentBal;
    }

        
     public String deposit() {
    String output = "Bank Name: " + bankName + "\n";
    output += "Current Balance: $" + currentBal + "\n";
    output += "Deposit Amount: $" + deposit + "\n";
    output += "Balance after deposit: $" + (currentBal + deposit);
    //output string is complete, return it
    return output;
        
     }   
     public String withDraw() {
    String output = "Bank Name: " + bankName + "\n";
    output += "Current Balance: $" + currentBal + "\n";
    output += "Withdraw Amount: $" + withdraw + "\n";
     //if the amount withdrawn is more than current balance, dont let it happen.
    if((currentBal-withdraw)<0){
        output+= ("You cannot withdraw more money than you have.");
    }else{
    output += "Balance after withdraw: $" + (currentBal - withdraw);
    }  //output string is complete, return it
    return output;

     }    

    public String dailyIntrest() {
    String output = "Bank Name: " + bankName + "\n";
    output += "Current Balance: $" + currentBal + "\n";
    output += "Days Of Intrest Amount: " + numberOfDays+"\n";
    output += "Daily Intrest Percentage: %"+dailyIntrest+"\n";
    output += "Balance after daily intrest calculation: $"+((currentBal*Math.pow((1+dailyIntrest),numberOfDays)));
    //output string is complete, return it
    return output;
    }
}
