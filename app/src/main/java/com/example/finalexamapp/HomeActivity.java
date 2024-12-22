package com.example.finalexamapp;


import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;
    private List<Note> noteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        noteList = new ArrayList<>();
        noteList.add(new Note("Math", R.drawable.mathnotes));
        noteList.add(new Note("Science", R.drawable.sciencen));
        noteList.add(new Note("History", R.drawable.));
        noteList.add(new Note("English", R.drawable.english_icon));


        noteAdapter = new NoteAdapter(noteList, new NoteAdapter.OnNoteClickListener() {
            @Override
            public void onNoteClick(Note note) {

                Toast.makeText(HomeActivity.this, note.getTitle() + " Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.setAdapter(noteAdapter);
    }
}
