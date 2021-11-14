package unit6.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<>(Arrays.asList(
            new Client(1, "Папиросович", 43, Arrays.asList(new Phone("1", true))),
            new Client(2, "Сидорович", 23, Arrays.asList(new Phone("2", true), new Phone("11", false))),
            new Client(3, "Папиросович", 18, Arrays.asList(new Phone("12", false))),
            new Client(4, "БратБратанБратишка", 22, Arrays.asList(new Phone("4", true))),
            new Client(5, "Пупсень", 56, Arrays.asList(new Phone("5", true), new Phone("13", false))),
            new Client(6, "Вупсень", 41, Arrays.asList(new Phone("14", false))),
            new Client(7, "Курилович", 33, Arrays.asList(new Phone("7", true))),
            new Client(8, "Папиросович", 50, Arrays.asList(new Phone("8", true), new Phone("15", false))),
            new Client(9, "Гейний", 60, Arrays.asList(new Phone("16", false))),
            new Client(10, "Папиросович", 49, Arrays.asList(new Phone("17", true)))
        ));

        System.out.println(clients);

        //1
        System.out.println(
            clients.stream().reduce(0,
                                    (x, y) -> {
                                        if (y.getName().equals("Папиросович")) {
                                            return x + y.getAge();
                                        } else {
                                            return x + 0;
                                        }
                                    },
                                    (x, y) -> x + y)
        );

        //2
        LinkedHashSet<String> names = new LinkedHashSet<String>(
            clients
                .stream()
                .map(Client::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new))
        );
        System.out.println(names);

        //3
        System.out.println(
            clients
                .stream()
                .anyMatch(client -> client.getAge() > 59)
        );

        //4
//        LinkedHashMap<Integer, String> clientsMap =
//            clients.stream().collect(Collectors.toMap(Client::getId, Client::getName));

        //5
        //6
        //7

    }
}
