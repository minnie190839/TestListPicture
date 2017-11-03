package com.example.win8.testlistpicture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.win8.testlistpicture.Adapter.AnimalListAdapter;
import com.example.win8.testlistpicture.Model.Animals;

import java.util.ArrayList;

public class AnimalDetailActivity extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

            ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
            TextView nameTextView = (TextView) findViewById(R.id.detail_text_view);

            Intent intent = getIntent();
            int position = intent.getIntExtra("position", 0);

            AnimalData animalData = AnimalData.getInstance();
            Animals animal = animalData.animalList.get(position);

            nameTextView.setText(animal.detail);
            animalImageView.setImageResource(animal.picture);




        getSupportActionBar().setTitle(animal.name);
        }
    }


