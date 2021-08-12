package main.unit1.note;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import unit1.note.Note;
import unit1.note.Notepad;

class NotepadTest {

    @Test
    void addOneNote() {
        var notepad = new Notepad(1);

        var textFirstNote = "Test of first note";
        notepad.addNote(textFirstNote);

        assertEquals(notepad.getNotes().length, 1);
        assertEquals(notepad.getNotes()[0], new Note(textFirstNote));
    }
    @Test
    void addNotesMoreThenSize() {
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
    void updateNote() {
        var notepad = new Notepad(1);

        String textFirstNote = "First note";
        String textSecondNote = "Second note";

        notepad.addNote(textFirstNote);
        notepad.updateNote(0, textSecondNote);

        assertEquals(notepad.getNotes()[0], new Note(textSecondNote));
    }

    @Test
    void getNotes() {
        var notepad = new Notepad(2);

        String textFirstNote = "First note";
        String textSecondNote = "Second note";
        notepad.addNote(textFirstNote);
        notepad.addNote(textSecondNote);

//        assertEquals(notepad.getNotes(), );

    }

    @Test
    void getLastNoteIndex() {
    }
}