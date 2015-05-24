package com.example.smokydesperado.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class TestTivity extends ActionBarActivity {

    // Edit text I think
    EditText scripture, chapter, verse;

    // intent goes here
    Intent startbuttonintent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_tivity);

        // let's assign a string to each box here.
        scripture = (EditText) findViewById(R.id.editText);
        chapter   = (EditText) findViewById(R.id.editText2);
        verse     = (EditText) findViewById(R.id.editText3);


        // And now our button!!  If all goes well, this will not be a problem. IF.
        Button but = (Button) findViewById(R.id.button);

        // This is SO strange, but the internet said it worked and the compiler said it worked so
        // I guess I can't really say anything about it.  API's man...
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String scriptureName = scripture.getText().toString();
                String chapterName   = chapter.getText().toString();
                String verseName     = verse.getText().toString();

                startbuttonintent = new Intent(TestTivity.this, page2.class);

                startbuttonintent.putExtra("SCRIPTURE",scriptureName);
                startbuttonintent.putExtra("CHAPTER"  ,chapterName);
                startbuttonintent.putExtra("VERSE"    , verseName);

                startActivity(startbuttonintent);
            }
        });

    }
        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_tivity, menu);
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
