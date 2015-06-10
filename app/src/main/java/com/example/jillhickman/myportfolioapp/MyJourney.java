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
        CharSequence text = "Launches my Spotify Streamer App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    //button for scores app with toast
    public void scoresMessage (View view){
        Context context = getApplicationContext();
        CharSequence text = "Launches my Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    //button for library app with toast
    public void libraryMessage (View view){
        Context context = getApplicationContext();
        CharSequence text = "Launches my Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    //button for build it bigger app with toast
    public void buildMessage (View view){
        Context context = getApplicationContext();
        CharSequence text = "Launches my Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    //button for XYZ reader with toast
    public void readerMessage (View view){
        Context context = getApplicationContext();
        CharSequence text = "Launches my XYZ Reader App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text, duration);
        toast.show();
    }

    public  void capstoneMessage (View view){
        Context context = getApplicationContext();
        CharSequence text = "Launches my Capstone:My Own App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
