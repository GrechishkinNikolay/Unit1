package main.unit1.note;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import unit1.note.Note;
import unit1.note.Notepad;

class NotepadTest {

    @Test
    void addOneNote() {
        var notepad = new Notepad(1);

        String textFirstNote = "Test of first note";
        notepad.addNote(textFirstNote);

        assertEquals(notepad.getNotes().length, 1);
        assertEquals(notepad.getNotes()[0], new Note(textFirstNote));
    }
    @Test
    void addNotesMoreThenSize() {
        var notepad = new Notepad(1);

        String textFirstNote = "Test of first note";
        String textSecondNote = "Test of second note";
        notepad.addNote(textFirstNote);
        notepad.addNote(textSecondNote);

        assertEquals(notepad.getNotes().length, 2);
        assertEquals(notepad.getNotes()[0], new Note(textFirstNote));
        assertEquals(notepad.getNotes()[1], new Note("Test of second note"));
    }

    @Test
    void updateNote() {
    }

    @Test
    void getNotes() {
    }

    @Test
    void getLastNoteIndex() {
    }
}