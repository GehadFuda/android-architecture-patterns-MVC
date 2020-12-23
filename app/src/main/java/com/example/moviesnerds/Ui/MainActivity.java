package com.example.moviesnerds.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView movieNameTextView;
    Button getmovieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTextView = findViewById(R.id.textView);
        getmovieButton = findViewById(R.id.button);
        getmovieButton.setOnClickListener(this);
    }

    public MovieModel getMovieFromDatabase() {
        return new MovieModel("cast away", "21-9-1996", "very sad movie", 1);
    }

    public void getMovie() {
        movieNameTextView.setText(getMovieFromDatabase().getName());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            getMovie();
        }
    }
}