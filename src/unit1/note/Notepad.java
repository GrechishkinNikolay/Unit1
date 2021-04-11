package unit1.note;
/**
 * @author Nikolay
 * @version 1.0
 * Provides the classes necessary to create, update and display user notes.
 */
import java.util.Arrays;

/**
 * The Notepad class represents notes storage.
 */
public class Notepad {

    /**
     * Array of stored notes
     */
    private Note[] notes;
    /**
     * Index of last added unit1.note.
     */
    private int lastNoteIndex;

    /**
     * Constructor
     * @param size Initial storage size.
     */
    public Notepad(int size) {
        this.notes = new Note[size];
        this.lastNoteIndex = 0;
    }

    /**
     * Method for adding a unit1.note.
     * @param noteText Note text.
     */
    public void addNote(String noteText) {
        if (lastNoteIndex >= notes.length) {
            notes = Arrays.copyOf(notes, notes.length * 2);
        }

        notes[lastNoteIndex] = new Note(noteText);
        lastNoteIndex++;
    }

    /**
     * Method for update a unit1.note.
     * @param noteIndex unit1.note index.
     * @param noteText New text of unit1.note.
     */
    public void updateNote(int noteIndex, String noteText) {
        notes[noteIndex].setNoteText(noteText);
    }

    /**
     * Return all notes.
     * @return notes.
     */
    public Note[] getNotes() {
        return notes;
    }

    /**
     * Method for getting last unit1.note index.
     * @return last unit1.note index.
     */
    public int getLastNoteIndex() {
        return lastNoteIndex;
    }
}
