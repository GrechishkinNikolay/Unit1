package unit1;

import java.util.Scanner;
import unit1.note.Note;
import unit1.note.Notepad;

/**
 * @author Nikolay
 * @version 1.0
 * Class of the fifth task
 */
public class Task5 {

    /**
     * Print all notepad notes.
     * @param notepad notepad whose notes will be displayed
     */
    public static void printAllNotesOfNotepad(Notepad notepad) {

        if (notepad.getLastNoteIndex() == 0) {
            System.out.println("Блокнот пуст");
            return;
        }

        Note[] notes = notepad.getNotes();

        for (int i = 0; i < notepad.getLastNoteIndex(); i++) {
            System.out.println(i + " - " + notes[i].getNoteText());
        }
    }

    /**
     * Entry point of fifth task
     * @param args run parameters
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;

        Notepad notepad = new Notepad(3);

        for (; ; ) {
            System.out.println("11 - Добавить новую запись в блокнот\n2 - Изменить запись\n3 - отобразить все записи\n4 - выход");
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

    }
}
