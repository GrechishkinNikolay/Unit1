package Unit2.Messengers;

public class SecondMessenger implements Messenger{

    @Override
    public void sendMessage(String text, Customer customer) {
        Messages.messagesMap.put(customer.getName(), text + " (Отправлено вторым мессенджером)");
    }

    @Override
    public String readMessage(String name) {
        return Messages.messagesMap.get(name) + " (Прочитано вторым мессенджером)";
    }
}
