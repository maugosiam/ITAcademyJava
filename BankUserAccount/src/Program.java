public class Program {
    public static void main(String args[]){
        Customer customer01 = new Customer("Anna", "Krawiec");
        Customer customer02 = new Customer("Joanna", "Kraw");
        Customer customer03 = new Customer("Agnieszka", "Mielcarek");
        Customer customer04 = new Customer("Dorota", "Jantar");

        customer01.bankAccount[0] = new BankAccount("1234", 1000);
        customer01.bankAccount[1] = new BankAccount("5678", 1000);
        customer01.bankAccount[2] = new BankAccount("9876", 1000);

        customer02.bankAccount[0] = new BankAccount("2234", 2000);
        customer02.bankAccount[1] = new BankAccount("2678", 2000);
        customer02.bankAccount[2] = new BankAccount("2876", 2000);

        customer01.printCustomerAccount();
        customer02.printCustomerAccount();

        double amountOfMoneyToDeposit = 1000;
        customer01.depositMoney(customer01.bankAccount[0], amountOfMoneyToDeposit);
        customer01.printCustomerAccount();
        customer02.printCustomerAccount();

        double amountOfMoneyToTransfer = 1000;
        customer01.transferMoney(customer01.bankAccount[0], customer02.bankAccount[0], amountOfMoneyToTransfer);
        customer01.printCustomerAccount();
        customer02.printCustomerAccount();
    }
}
