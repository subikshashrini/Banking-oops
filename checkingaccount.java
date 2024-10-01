class checkingaccount extends bankaccount{
    private double overdraftlimit;

    public checkingaccount(String accountholdername,String accountnumber,double balance,double overdraftlimit){
        super(accountholdername,accountnumber,balance);
        this.overdraftlimit=overdraftlimit;
    }
    public void withdraw(double amount){
        if(balance+overdraftlimit >= amount){
            balance=balance-amount;
            System.out.println("Withdrawn successfully!balance is "+balance);
        }
        else{
            System.out.println("Cant withdraw!exceeds overdraftlimit");
        }
    }

    public void welcomemsg(){
        System.out.println("WELCOME TO CHECKINGACCOUNT BANKING!!!!");
    }
}
