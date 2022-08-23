package data;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.setAccount_holder_name("Raj");
        obj.setAccount_opening_date("02/05/2022");
        obj.setAccount_status("Active");
        obj.setAccountNumber(234567892367L);
        obj.setAvailable_balance(5000);
        obj.setInternet_mobile_Banking(true);
        obj.setInterset_rate(5);
        obj.setMode_of_operation("Self operated");
        System.out.println("Name = "+obj.getAccount_holder_name());
        System.out.println("Account opening date = "+obj.getAccount_opening_date());
        System.out.println("Account status = "+obj.getAccount_status());
        System.out.println("Account number = "+obj.getAccountNumber());
        System.out.println("Available balance = "+obj.getAvailable_balance());
        System.out.println("Internet banking facility = "+obj.getInternet_mobile_Banking());
        System.out.println("Interest rate = "+obj.getInterset_rate());
        System.out.println("Mode of operation = "+obj.getMode_of_operation());

        double res2 = obj.creditAmounts(4000);
        double res3 = obj.debitCash(res2,2000);
        System.out.println("after credit = "+res2);
        System.out.println("after debit = "+res3);
    }
}