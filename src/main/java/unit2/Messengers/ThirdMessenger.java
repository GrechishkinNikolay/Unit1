package unit2.Messengers;

public class ThirdMessenger implements Messenger{

    @Override
    public void sendMessage(String text, Customer customer) {
        Messages.messagesMap.put(customer.getName(), text + " (Отправлено третьим мессенджером)");
    }

    @Override
    public String readMessage(String name) {
        return Messages.messagesMap.get(name) + " (Прочитано третьим мессенджером)";
    }
}
