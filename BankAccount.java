public class BankAccount{
    private int AccountId;
    private int Balance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;


    public BankAccount(){
        this(0, 0, "default name", "default mail", "default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int AccountId, int Balance, String CustomerName, String Email, String PhoneNumber){
        System.out.println("with parameters");
        this.AccountId = AccountId;
        this.Balance = Balance;
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }
    public void DepositFund(int AddMoney){
        this.Balance += AddMoney;
    }
    public void WithdrawFund(int GetMoney){
        if (GetMoney < this.AccountId){
            this.Balance -= GetMoney;
        }else{
            System.out.println("Error!");
        }
    }

    public void setAccountId(int AccountId){
        this.AccountId = AccountId;
    }
    public int getAccountId(){
        return this.AccountId;
    }

    public void setBalance(int Balance){
        this.Balance = Balance;
    }
    public int getBalance(){
        return this.Balance;
    }

    public void setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
    }
    public String getCustomerName(){
        return this.CustomerName;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return this.Email;
    }

    public void setPhoneNumber(String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }
    public String getPhoneNumber(){
        return this.PhoneNumber;
    }

}