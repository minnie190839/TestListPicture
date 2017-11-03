package com.example.win8.testlistpicture.Adapter;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.win8.testlistpicture.Model.Animals;
import com.example.win8.testlistpicture.R;

import java.util.ArrayList;

public class AnimalListAdapter extends ArrayAdapter<Animals>{
    private Context mcontext;
    private ArrayList<Animals> mAnimalList;
    private int mLayoutResId;

    public AnimalListAdapter(@NonNull Context context,  int resourse, @NonNull ArrayList<Animals> objects) {
        super(context,resourse,objects);
        this.mcontext = context;
        this.mLayoutResId = resourse;
        this.mAnimalList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =LayoutInflater.from(mcontext);
        ViewGroup root;
        View v =inflater.inflate(mLayoutResId,null);

        ImageView iv =(ImageView) v.findViewById(R.id.imageView);
        TextView tv =(TextView) v.findViewById(R.id.textView);

        Animals animal = mAnimalList.get(position);

        iv.setImageResource(animal.picture);
        tv.setText(animal.name);

        return v;
    }
}
