class savingsaccount extends bankaccount {
    private double minimumbalance;
    public savingsaccount(String accountholdername,String accountnumber,double balance,double minimumbalance){
        super(accountholdername,accountnumber,balance);
        this.minimumbalance = minimumbalance;
    }
    public void withdraw(double amount){
        if(balance-amount>=minimumbalance){
            balance = balance-amount;
            System.out.println("Amount withdrawn successfully!Your current balance is "+balance);
        }
        else{
            System.out.println("Cant withdraw!Needed to maintain minimum balance");
        }
    }
    public void calculateinterest(double interestrate){
        double interest = (balance*interestrate)/100;
        balance = balance+interest;
        System.out.println(getAccountholdername()+" new balance after interest is "+balance);
    }
    public void welcomemsg(){
        System.out.println("WELCOME TO SAVINGS ACCOUNT BANKING!!!!");
    }
}
