package com.example.aad_topic5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //create lists of contacts to display in Recycler view
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Martin Luis","9851001818",R.drawable.momj));
        contactsList.add(new Contacts("Michael Jordon","98546431311",R.drawable.celb));
        contactsList.add(new Contacts("Martin Brat","98545451231",R.drawable.eagle));



        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
