package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        //Generate contact list in recyclerview
        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Screenshot1","9860170437",R.drawable.a));
        contactsList.add(new Contacts("Screenshot1","9860170437",R.drawable.b));
        contactsList.add(new Contacts("Screenshot1","9860170437",R.drawable.c));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
