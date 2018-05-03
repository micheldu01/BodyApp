package com.example.michel.bodyapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
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

    // DECLARE DRAWER LAYOUT
    @BindView(R.id.activity_main_drawer_layout)DrawerLayout drawerLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DECLARE BUTTER KNIFE
        ButterKnife.bind(this);

        // ADD TOOLBAR
        this.configureToobar();

        // ADD DRAWER LAYOUT
        this.configureDrawerLayout();





    }


    // METHOD FOR GET TOOLBAR
    private void configureToobar() {

        // IMPLEMENT TOOLBAR
        setSupportActionBar(toolbar);
    }


    // IMPLEMENT MENU IN TOOLBAR
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // IMPLEMENT THE MENU LAYOUT INTO THE TOOLBAR
        getMenuInflater().inflate(R.menu.menu_activty_main, menu);
        return true;
    }


    // IMPLEMENT BUTTON SEARCH INTO MENU TOOLBAR
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // IMPLEMENT SWTICH INTO MENU TOOLBAR
        switch (item.getItemId()){

            // IMPLEMENT BUTTON SEARCH
            case R.id.menu_activity_main_search:

                // WHEN SELECT
                Toast.makeText(this,"Il me reste à implementer le bouton search", Toast.LENGTH_SHORT).show();
        }
        // FINISH
        return super.onOptionsItemSelected(item);
    }


    // IMPLEMENT DRAWER LAYOUT
    private void configureDrawerLayout(){
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

}



























