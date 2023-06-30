/**
 * @author (Herbert Wenisch)
 * @version (30-06-23)
 */

import java.text.DecimalFormat;

public class Account{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private int no;
    private String owner;
    private double balance;
    private double turnover;
    private final double turnoverMax = 1500;
    
    public Account(int no, String owner){
        this.no = no;
        this.owner = owner;
        this.balance = 2000;
    }
    
    public boolean payIn(double amount){
        return true;
    }
    
    public boolean payOut(double amount){
        if(amount < 0 || amount > balance || turnover + amount > turnoverMax) return false;
        balance -= amount;
        turnover += amount;
        return true;
    }
    
    public boolean transfer(Account goal, double amount){
        return true;
    }
    
    @Override
    public String toString(){
        String out = "Inhaber: " +  owner + "\n";
        out += "Kontonummer: " + no + "\n";
        out += "aktueller Kontostand: " + df.format(balance) + " €" + "\n";
        out += "bisheriger Tagesumsatz: " + df.format(turnover)  + " €";
        return out;
    }
}
