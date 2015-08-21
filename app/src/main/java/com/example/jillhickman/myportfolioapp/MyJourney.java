package com.example.jillhickman.myportfolioapp;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

// I got the toast code snippets from developer.android.com


public class MyJourney extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_journey);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_journey, menu);
        return true;
    }
    //button for spotify streamer app with toast
    public void spotifyMessage (View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, R.string.spotify_message, duration);
        toast.show();
    }
    //button for scores app with toast
    public void scoresMessage (View view){
        Toast.makeText(getApplicationContext(),R.string.scores_message, Toast.LENGTH_SHORT).show();
    }
    //button for library app with toast
    public void libraryMessage (View view){
        Toast.makeText(getApplicationContext(), R.string.library_message, Toast.LENGTH_SHORT).show();
    }
    //button for build it bigger app with toast
    public void buildMessage (View view){
        Toast.makeText(getApplicationContext(), R.string.spotify_message, Toast.LENGTH_SHORT).show();
    }
    //button for XYZ reader with toast
    public void readerMessage (View view){
        Toast.makeText(getApplicationContext(), R.string.reader_message, Toast.LENGTH_SHORT).show();
    }
    public  void capstoneMessage (View view){
        Toast.makeText(getApplicationContext(), R.string.capstone_message, Toast.LENGTH_SHORT).show();
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
}
