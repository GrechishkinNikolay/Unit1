package unit2;

import unit2.Messengers.Customer;
import unit2.Messengers.FirstMessenger;
import unit2.Messengers.SecondMessenger;
import unit2.Messengers.ThirdMessenger;

/*
    Задание 3. Интерфейсы
Разработать программу, которая предоставит возможность клиенту общаться в мессенджере.
Создать 3 мессенджера, у которых должны быть обязательно определены методы sendMessage() и readMessage().
У клиента может быть только 1 из 3 мессенджеров, но заранее неизвестно, какой именно.
*/
public class Task3 {

    public static void main(String[] args) {

        FirstMessenger firstMessenger = new FirstMessenger();
        SecondMessenger secondMessenger = new SecondMessenger();
        ThirdMessenger thirdMessenger = new ThirdMessenger();

        Customer вика = new Customer("Вика");
        Customer катя = new Customer("Катя");

        вика.setMessenger(firstMessenger);
//        вика.setMessenger(secondMessenger);
//        вика.setMessenger(thirdMessenger);

//        катя.setMessenger(firstMessenger);
//        катя.setMessenger(secondMessenger);
        катя.setMessenger(thirdMessenger);

        вика.sendMessage("Первое сообщение Вике от Кати", катя);

        катя.readMessage();

    }
}
