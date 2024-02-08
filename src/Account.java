import java.awt.*;

public class Account {
    private Type type;
    private Metadata metadata;

    public Account(AccountFactory factory) {
        type = factory.createType();
        metadata = factory.createMetadata();
    }

    public void paint() {
        type.printType();
        metadata.printMetadata();
    }
}