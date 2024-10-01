class bankaccount extends accountoperations{
    private String accountholdername;
    private String accountnumber;
    protected double balance;//balance is needed in derived class.so protected
    public bankaccount(String accountholdername,String accountnumber,double balance){
        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public String getAccountholdername(){
        return accountholdername;
    }
    public String getAccountnumber(){
        return accountnumber;
    }
    public double getBalance(){
        return balance;
    }
    public void checkbalance(){
        System.out.println(accountholdername+" balance is "+balance);
    }
    public void deposit(double amount){
        balance = balance+amount;
        System.out.println(accountholdername+" balance after deposit of "+amount + " is "+ balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance = balance-amount;
            System.out.println(accountholdername+" amount has been withdrawn successfully!Your current balance " +
                    "is "+balance);

        }
        else if(amount>balance){
            System.out.println("Insufficient balance");
        }
    }
}


