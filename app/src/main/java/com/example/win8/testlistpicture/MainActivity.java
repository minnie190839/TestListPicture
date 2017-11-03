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

public class MainActivity extends AppCompatActivity {

    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);

        final AnimalData animalData = AnimalData.getInstance();
        animalData.animalList = new ArrayList<>();

        animalData.animalList.add(new Animals("แมว(Cat)", R.drawable.cat,R.string.details_cat));
        animalData.animalList.add(new Animals("สุนัข(Dog)", R.drawable.dog,R.string.details_dog));
        animalData.animalList.add(new Animals("โลมา(Dolphin)", R.drawable.dolphin,R.string.details_dolphin));
        animalData.animalList.add(new Animals("โคอาล่า(Koala)", R.drawable.koala,R.string.details_koala));
        animalData.animalList.add(new Animals("นกฮูก(Owl)", R.drawable.owl,R.string.details_owl));
        animalData.animalList.add(new Animals("กระต่าย(Ribbit)", R.drawable.rabbit,R.string.details_rabbit));
        animalData.animalList.add(new Animals("เพนกวิน(Penguin)", R.drawable.penguin,R.string.details_penguin));
        animalData.animalList.add(new Animals("เสือ(Tiger)", R.drawable.tiger,R.string.details_tiger));
        animalData.animalList.add(new Animals("หมู(Pig)", R.drawable.pig,R.string.details_pig));
        animalData.animalList.add(new Animals("สิงโต(Lion)", R.drawable.lion,R.string.details_lion));


        AnimalListAdapter adapter = new AnimalListAdapter(this,R.layout.item,animalData.animalList);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Animals animal = animalData.animalList.get(i);
                Toast.makeText(MainActivity.this, animal.name, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,AnimalDetailActivity.class);
                //intent.putExtra("name", animal.name);
                //intent.putExtra("picture", animal.picture);
                intent.putExtra("position", i);

                startActivity(intent);
            }
        });

    }
}

