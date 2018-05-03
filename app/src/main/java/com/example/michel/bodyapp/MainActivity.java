package com.example.michel.bodyapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {


    // DECLARE TOOLBAR
    @BindView(R.id.activity_main_toolbar)
    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DECLARE BUTTER KNIFE
        ButterKnife.bind(this);

        // ADD TOOLBAR
        this.configureToobar();






    }


    // METHOD FOR GET TOOLBAR
    private void configureToobar() {

        // IMPLEMENT TOOLBAR
        setSupportActionBar(toolbar);

    }


    // IMPLEMENT BUTTON SEARCH IN TOOLBAR
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // IMPLEMENT THE BUTTON INTO THE TOOLBAR
        getMenuInflater().inflate(R.menu.menu_activty_main, menu);
        return true;
    }



}



























