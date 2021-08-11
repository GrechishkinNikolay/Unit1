package unit2.Messengers;

public interface Messenger {

    public void sendMessage(String text, Customer recipient);
    public String readMessage(String name);
}
