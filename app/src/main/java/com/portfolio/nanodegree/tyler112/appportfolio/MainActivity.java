package com.portfolio.nanodegree.tyler112.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        String message = "";
        switch (view.getId()) {
            case R.id.btn_spotify_streamer:
                message = "Spotify Streamer";
                break;
            case R.id.btn_scores_app:
                message = "Scores";
                break;
            case R.id.btn_library_app:
                message = "Library";
                break;
            case R.id.btn_build_it_bigger:
                message = "Build it Bigger";
                break;
            case R.id.btn_xyz_reader:
                message = "XYZ Reader";
                break;
            case R.id.btn_my_own_app:
                message = "My Own App";
                break;
            default:

        }

        Toast.makeText(this, "This button will launch my " + message + " app!", Toast.LENGTH_SHORT).show();

    }
}
