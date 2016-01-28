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

/**
 * Created by 1006749 on 1/21/2016.
 */
public class question7 extends Activity {

    private Button Next;
    private Button NextWrong1;
    private Button NextWrong2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_7);

        NextWrong1 = (Button)findViewById(R.id.button9);
        NextWrong2 = (Button)findViewById(R.id.button10);
        Next = (Button)findViewById(R.id.button11);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.counter++;
                startActivity(new Intent(question7.this, results.class));
            }
        });

        NextWrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(question7.this, results.class));
            }
        });

        NextWrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(question7.this, results.class));
            }
        });
    }
}
