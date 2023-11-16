package com.example.ppapb_pertemuan12_note

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Update
    fun update(note: Note)
    
    @Delete
    fun delete(note: Note)

    @get:Query("SELECT * FROM note_table ORDER BY id ASC")
    val allNotes: LiveData<List<Note>>
}