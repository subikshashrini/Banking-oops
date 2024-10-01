public class main {
    public static void main(String[] args) {
        bankaccount user1 = new bankaccount("SUBIKSHA","1A2B3C",200000.00);
        bankaccount user2 = new bankaccount("Imsa","4D5E6F",4000000.00);
        user1.checkbalance();
        user2.deposit(20000.00);
        user2.withdraw(2000.00);
        savingsaccount user3 = new savingsaccount("Riya","7G8H9I",2000,500);
        user3.withdraw(1600);
        user3.calculateinterest(4);
        user3.checkbalance();
        checkingaccount user4 = new checkingaccount("asa","A22002",42000000.00,2000.00);
        user4.checkbalance();
        user4.deposit(20000);
        user4.withdraw(20000);

        accountoperations user5 = new bankaccount("Absa","Absaccount",40000);
        user5.welcomemsg();

        accountoperations user6 = new savingsaccount("Abisha","Abisaccount",40000,20);
        user6.welcomemsg();
    }
}
