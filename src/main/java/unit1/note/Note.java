package unit1.note;

import java.util.Objects;

/**
 * @author Nikolay
 * @version 1.0
 * Provides the classes necessary to create, update and display user notes.
 */
public class Note {

    /**
     * Note text
     */
    private String noteText;

    /**
     * Constructor
     * @param noteText Note text
     */
    public Note(String noteText) {
        this.noteText = noteText;
    }

    /**
     * Note text getter
     * @return main.unit1.note text
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Note text setter
     * @param noteText main.unit1.note text
     */
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Note note = (Note) o;
        return Objects.equals(noteText, note.noteText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteText);
    }
}
