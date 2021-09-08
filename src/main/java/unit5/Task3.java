package unit5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import unit5.forTask3.Actor;
import unit5.forTask3.Film;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        Actor Matthew = new Actor("Matthew David McConaughey");
        Actor Anne = new Actor("Anne Jacqueline Whitney Hathaway");
        Actor Jessica = new Actor("Jessica Chastain");

        Film interstellar = new Film("Interstellar");
        Film theGentlemen = new Film("The Gentlemen");

        List<Film> films = new ArrayList<>();

        interstellar.getActors().add(Matthew);
        interstellar.getActors().add(Anne);
        theGentlemen.getActors().add(Matthew);
        theGentlemen.getActors().add(Jessica);

        films.add(interstellar);
        films.add(theGentlemen);

        final File file = new File("src/main/resources/serialisedFilms.txt");
        try (
            final FileInputStream fileInputStream = new FileInputStream(file);
            final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            FileOutputStream fileOutputStream = file.length() < 5 ? new FileOutputStream(file) : null;
            ObjectOutputStream objectOutputStream = file.length() < 5 ? new ObjectOutputStream(fileOutputStream) : null;

            for (; ; ) {
                System.out.println("1 - Загрузить из файла\n2 - Сохранить в файл\n3 - Отобразить\n4 - Добавить\n5 - выйти и сохранить");
                choice = in.nextInt();

                switch (choice) {
                    case 1: {
                        in.nextLine();

                        if (file.length() < 5) {
                            System.out.println("Файл пуст");
                            break;
                        }

                        films = (List<Film>) objectInputStream.readObject();
                        System.out.println("Список фильмов загружен из файла");
                        break;
                    }
                    case 2: {
                        in.nextLine();

                        if (objectOutputStream == null & fileOutputStream == null) {
                            fileOutputStream = new FileOutputStream(file);
                            objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        }

                        objectOutputStream.writeObject(films);
                        System.out.println("Список фильмов загружен в файл");
                        break;
                    }
                    case 3: {
                        in.nextLine();
                        System.out.println(films);
                        break;
                    }
                    case 4: {
                        in.nextLine();
                        System.out.println("Введите название фильма: ");
                        String title = in.nextLine();
                        Film film = new Film(title);
                        System.out.println("Введите актера: ");
                        String name = in.nextLine();
                        film.getActors().add(new Actor(name));
                        films.add(film);
                        break;
                    }
                    case 5: {
                        return;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
