
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account mattA = new Account("Matthews account", 1000.0);
        Account myA = new Account("My account", 0);
        
        mattA.withdrawal(100.0);
        myA.deposit(100.0);
        System.out.println(mattA.toString());
        System.out.println(myA.toString());
        
    }
}
