package unit1.note;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NotepadTest {

    @Test
    void addOneNoteTest() {
        var notepad = new Notepad(1);

        var textFirstNote = "Test of first note";
        notepad.addNote(textFirstNote);

        assertEquals(notepad.getNotes().length, 1);
        assertEquals(notepad.getNotes()[0], new Note(textFirstNote));
    }

    @Test
    void addNotesMoreThenSizeTest() {
        var notepad = new Notepad(1);

        String textFirstNote = "Text of first note";
        String textSecondNote = "Text of second note";
        notepad.addNote(textFirstNote);
        notepad.addNote(textSecondNote);

        assertEquals(notepad.getNotes().length, 2);
        assertEquals(notepad.getNotes()[0], new Note(textFirstNote));
        assertEquals(notepad.getNotes()[1], new Note(textSecondNote));
    }

    @Test
    void updateNoteTest() {
        var notepad = new Notepad(1);

        String textFirstNote = "First note";
        String textSecondNote = "Second note";

        notepad.addNote(textFirstNote);
        notepad.updateNote(0, textSecondNote);

        assertEquals(notepad.getNotes()[0], new Note(textSecondNote));
    }

    @Test
    void getNotesTest() {
        var notepad = new Notepad(3);

        String textFirstNote = "First note";
        String textSecondNote = "Second note";
        String textThirdNote = "Third note";
        notepad.addNote(textFirstNote);
        notepad.addNote(textSecondNote);
        notepad.addNote(textThirdNote);

        Note[] notes = notepad.getNotes();

        assertEquals(notes.length, 3);
        assertArrayEquals(notes, new Note[]{new Note(textFirstNote), new Note(textSecondNote), new Note(textThirdNote)});
    }

    @Test
    void getLastNoteIndex() {
        var notepad = new Notepad(2);

        assertEquals(notepad.getLastNoteIndex(), 0);

        String textFirstNote = "Text of first note";
        notepad.addNote(textFirstNote);

        assertEquals(notepad.getLastNoteIndex(), 1);



    }
}