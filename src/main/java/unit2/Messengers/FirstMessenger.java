package unit2.Messengers;

public class FirstMessenger implements Messenger{

    @Override
    public void sendMessage(String text, Customer recipient) {
        Messages.messagesMap.put(recipient.getName(), text + " (Отправлено первым мессенджером)");
    }

    @Override
    public String readMessage(String name) {
        return Messages.messagesMap.get(name) + " (Прочитано первым мессенджером)";
    }
}
