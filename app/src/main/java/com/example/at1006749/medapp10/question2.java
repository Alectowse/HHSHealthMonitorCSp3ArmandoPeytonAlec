package com.example.at1006749.medapp10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 1006749 on 1/21/2016.
 */
public class question2 extends Activity {

    private Button Next;
    private EditText textW;
    private char dchar;
    private char lchar;
    private char rchar;
    private char ochar;
    private char wchar;
    String WorldH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_2);

        Next = (Button)findViewById(R.id.button4);
        textW = (EditText)findViewById(R.id.editText);
        WorldH = textW.toString();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dchar == WorldH.charAt(0)){
                    MainActivity.counter++;
                }
                startActivity(new Intent(question2.this, question3.class));
            }
        });
    }
}
