package com.example.at1006749.medapp10;

<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
=======
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
>>>>>>> refs/remotes/origin/peyton

/**
 * Created by 1006749 on 1/21/2016.
 */
<<<<<<< HEAD
public class question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);
=======
public class question1 extends Activity {

    private Button Next;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {
        View view = inflater.inflate(R.layout.question_1, container, false);
        return view;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Next = (Button) rootView.findViewById(R.id.button4);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(question1.this, question2.class));
            }
        });
>>>>>>> refs/remotes/origin/peyton
    }
}
