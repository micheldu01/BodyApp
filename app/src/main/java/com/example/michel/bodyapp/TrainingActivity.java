package com.example.michel.bodyapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;


public class TrainingActivity extends MainActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);




        // ADD TOOLBAR
        this.configureToolbar();










    }


    // IMPLEMENT TOOLBAR
    private void configureToolbar() {

        // SET THE TOOLBAR
        setSupportActionBar(toolbar);

        // GET A SUPPORT ACTIONBAR CORRESPONDING TO THIS TOOLBAR
        ActionBar ab = getSupportActionBar();

        // ENABLE THE UP BUTTON
        ab.setDisplayHomeAsUpEnabled(true);
    }

}






















