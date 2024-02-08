public class SavingsAccountFactory implements AccountFactory{
    @Override
    public Type createType() {
        return new SavingsAccountType();
    }

    @Override
    public Metadata createMetadata() {
        return new SavingsAccountMetadata();
    }
}
