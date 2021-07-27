package com.example.roughwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public EditText insertThis;
    public Button addme;
    public ListView listView;

    ArrayList<String> listItems = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertThis = findViewById(R.id.insertThis);
        addme = findViewById(R.id.add);
        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);

        addme.setOnClickListener(v -> {
            listItems.add(insertThis.getText().toString());
            adapter.notifyDataSetChanged();
            insertThis.setText("");
        });


    }
}