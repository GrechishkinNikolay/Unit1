package unit2.Messengers;

public class Customer {

    public Messenger messenger;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void sendMessage(String text, Customer recipient) {
        this.messenger.sendMessage(text, recipient);
    }

    public void readMessage() {
        System.out.println(messenger.readMessage(name));

    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
