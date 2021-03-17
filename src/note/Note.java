package note;
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
     * @return note text
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Note text setter
     * @param noteText note text
     */
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
