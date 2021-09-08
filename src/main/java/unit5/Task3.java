package unit5;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import unit5.forTask3.Actor;
import unit5.forTask3.Film;

public class Task3 {

    public static void main(String[] args) {

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

        System.out.println(films);

        final ObjectInputStream objectInputStream = new ObjectInputStream();

        Scanner in = new Scanner(System.in);
        int choice;
/*
        for (; ; ) {
            System.out.println("11 - Добавить новую запись в блокнот\n2 - Изменить запись\n3 - отобразить все записи\n4 - выйти и сохранить");
            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    in.nextLine();
                    System.out.println("Введите текст записи: ");
                    String text = in.nextLine();
                    notepad.addNote(text);
                    break;
                }
                case 2: {
                    in.nextLine();
                    System.out.println("Введите номер записи: ");
                    int index = in.nextInt();
                    in.nextLine();
                    System.out.println("Введите текст записи: ");
                    String text = in.nextLine();
                    notepad.updateNote(index, text);
                    break;
                }
                case 3: {
                    printAllNotesOfNotepad(notepad);
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
        */

    }
}
