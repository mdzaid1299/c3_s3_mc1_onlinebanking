package data;

import java.util.Random;

public class SavingsAccount {
    private String account_holder_name;
    private  long accountNumber;
    private String account_opening_date;
    private  String account_status;
    private  double available_balance;
    private boolean internet_mobile_Banking;
    private double interset_rate;
    private String mode_of_operation;

    public double debitCash(double balance , double amount){
        return (balance - amount);

    }
    public double creditAmounts(double amount){
        return available_balance + amount;
    }
    public  void setAccount_holder_name(String account_holder_name){
        this.account_holder_name = account_holder_name;
    }
    public String getAccount_holder_name(){
        return account_holder_name;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccount_opening_date(String account_opening_date){
        this.account_opening_date = account_opening_date;
    }
    public String getAccount_opening_date(){
        return  account_opening_date;
    }
    public void setAccount_status(String account_status){
        this.account_status = account_status;
    }
    public String getAccount_status(){
        return  account_status;
    }
    public void setAvailable_balance(double available_balance){
        this.available_balance = available_balance;
    }
    public double getAvailable_balance(){
        return available_balance;
    }

    public void setInternet_mobile_Banking(boolean internet_mobile_Banking){
        this.internet_mobile_Banking = internet_mobile_Banking;
    }
    public  boolean getInternet_mobile_Banking(){
        return internet_mobile_Banking;
    }
    public void setInterset_rate(double interset_rate){
        this.interset_rate = interset_rate;
    }
    public double getInterset_rate(){
        return interset_rate;
    }
    public void setMode_of_operation(String mode_of_operation){
        this.mode_of_operation = mode_of_operation;
    }
    public  String getMode_of_operation(){
        return  mode_of_operation;
    }




}