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
public class question3 extends Activity {

    private Button Next;
    private EditText text;
    private EditText text2;
    private EditText text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_3);

        text = (EditText)findViewById(R.id.editText);
        text2 = (EditText)findViewById(R.id.editText2);
        text3 = (EditText)findViewById(R.id.editText3);

        Next = (Button)findViewById(R.id.button4);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.toString() == "Pencil"){
                    MainActivity.counter++;
                }
                if(text2.toString() == "Hamburger"){
                    MainActivity.counter++;
                }
                if(text3.toString() == "Hamster"){
                    MainActivity.counter++;
                }

                startActivity(new Intent(question3.this, question4.class));
            }
        });
    }
}