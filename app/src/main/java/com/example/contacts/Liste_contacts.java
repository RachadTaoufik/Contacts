package com.example.contacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.contacts.Contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class Liste_contacts extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab_add;
    RecyclerView contactsRecycler;
    EditText barreRecherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_contacts);

        contactsRecycler=(RecyclerView) findViewById(R.id.list_contacts);
        barreRecherche=(EditText) findViewById(R.id.search_text);
        fab_add=(FloatingActionButton) findViewById(R.id.fab_add);
        fab_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.fab_add){
            Intent myintent= new Intent(this, Ajouter_contact.class);
            startActivity(myintent);
        }
    }
}



