package com.example.michel.bodyapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.facebook.login.LoginManager;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    // DECLARE TOOLBAR
    @BindView(R.id.activity_main_toolbar)
    android.support.v7.widget.Toolbar toolbar;

    // DECLARE DRAWER LAYOUT
    @BindView(R.id.activity_main_drawer_layout)DrawerLayout drawerLayout;

    // DECLARE NAVIGATION VIEW
    @BindView(R.id.activity_main_nav_view)NavigationView navigationView;




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

        // ADD NAVIGATION VIEW
        this.configureNavigationView();





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



    //implement button DrawerLayout
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // 4 - Handle Navigation Item Click
        int id = item.getItemId();

        switch (id){

            // ASK SETTING
            case R.id.activity_main_drawer_training:
                Toast.makeText(this,"Il me reste à implementer le bouton", Toast.LENGTH_SHORT).show();


            // ASK SETTING
            case R.id.activity_main_drawer_settings:
                Toast.makeText(this,"Il me reste à implementer le bouton setting", Toast.LENGTH_SHORT).show();

                break;
                // ASK LOGOUT
            case R.id.activity_main_drawer_logout:
                Toast.makeText(this,"Il me reste à implementer le bouton logout", Toast.LENGTH_SHORT).show();

                break;

                default:
                    break;
            }

            this.drawerLayout.closeDrawer(GravityCompat.START);

            return true;
        }


    // METHOD DRAWER LAYOUT OPEN CLOSE
    @Override
    public void onBackPressed() {
        // 5 - Handle back click to close menu
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    // 3 - Configure NavigationView
    private void configureNavigationView(){
        navigationView.setNavigationItemSelectedListener(this);
    }

}




























