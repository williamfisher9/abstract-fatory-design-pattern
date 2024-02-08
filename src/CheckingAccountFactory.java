public class CheckingAccountFactory implements AccountFactory{
    @Override
    public Type createType() {
        return new CheckingAccountType();
    }

    @Override
    public Metadata createMetadata() {
        return new CheckingAccountMetadata();
    }
}
