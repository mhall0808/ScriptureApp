package com.example.smokydesperado.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class page2 extends ActionBarActivity {

    TextView scripture, chapter, verse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Bundle extras = getIntent().getExtras();

        String scriptureText = extras.getString("SCRIPTURE");
        String chapterText   = extras.getString("CHAPTER");
        String verseText     = extras.getString("VERSE");

        scripture = (TextView) findViewById(R.id.scripture);
        chapter   = (TextView) findViewById(R.id.chapter);
        verse     = (TextView) findViewById(R.id.verse);


        scripture.setText(scriptureText);
        chapter.setText(chapterText);
        verse.setText(verseText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page2, menu);
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
}
