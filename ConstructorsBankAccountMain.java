class ConstructorsBankAccountMain{
    public static void main(String[] args){
        BankAccount Tryshd = new BankAccount();
        Tryshd.setAccountId(00000000);
        Tryshd.setBalance(10000);
        Tryshd.DepositFund(7000);
        System.out.println(Tryshd.getBalance());
        Tryshd.WithdrawFund(20000);
        System.out.println(Tryshd.getBalance());
        BankAccount Mr_A = new BankAccount(01010101, 200, "Alisa",
                                            "hello@alisa.ne.jp", "0120-0000-0000");
        System.out.println(Mr_A.getEmail());
        
        BankAccount Ms_B = new BankAccount();
        System.out.println(Ms_B.getEmail());
    }
}