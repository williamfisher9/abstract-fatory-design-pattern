public class Main {
    public static void main(String[] args) {
        Account account = new Account(new CheckingAccountFactory());
        account.paint();

        account = new Account(new SavingsAccountFactory());
        account.paint();
    }
}