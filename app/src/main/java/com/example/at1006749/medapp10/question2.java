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
                if (dchar == WorldH.charAt(0)) {
                    MainActivity.counter++;
                    if (lchar == WorldH.charAt(1)) {
                        MainActivity.counter++;
                        if (rchar == WorldH.charAt(2)) {
                            MainActivity.counter++;
                            if (ochar == WorldH.charAt(3)) {
                                MainActivity.counter++;
                                if (wchar == WorldH.charAt(4)) { //dlrow
                                    MainActivity.counter++;
                                }
                            }
                            else if (wchar == WorldH.charAt(4)){ // dl-rw
                                MainActivity.counter++;
                            }
                        }
                        else if (ochar == WorldH.charAt(3)) {
                            MainActivity.counter++;
                            if (wchar == WorldH.charAt(4)) { //d-low
                                MainActivity.counter++;
                            }
                        }
                        else if (wchar == WorldH.charAt(4)){ //d-l-w
                            MainActivity.counter++;
                        }
                    }
                    else  if (rchar == WorldH.charAt(2)) {
                        MainActivity.counter++;
                        if (ochar == WorldH.charAt(3)) {
                            MainActivity.counter++;
                            if (wchar == WorldH.charAt(4)) { //d-row
                                MainActivity.counter++;
                            }
                        }
                        else if (wchar == WorldH.charAt(4)) { //d-r-w
                            MainActivity.counter++;
                        }
                    }
                    else if (ochar == WorldH.charAt(3)) {
                        MainActivity.counter++;
                        if (wchar == WorldH.charAt(4)) { //d--ow
                            MainActivity.counter++;
                        }
                    }
                    else if (wchar == WorldH.charAt(4)){ //d---w
                        MainActivity.counter++;
                    }
                }
                else if (lchar == WorldH.charAt(1)) { //Tree complete
                        MainActivity.counter++;
                        if (rchar == WorldH.charAt(2)){
                            MainActivity.counter++;
                            if (ochar == WorldH.charAt(3)) {
                                MainActivity.counter++;
                                if (wchar == WorldH.charAt(4)) { //-lrow
                                    MainActivity.counter++;
                                }
                            }
                        }
                        else if (ochar == WorldH.charAt(3)){
                            MainActivity.counter++;
                            if (wchar == WorldH.charAt(4)){ //-l-ow
                                MainActivity.counter++;
                            }
                        }
                        else if (wchar == WorldH.charAt(4)){ //-l--w
                            MainActivity.counter++;
                        }
                }
                else if (rchar == WorldH.charAt(2)) { //Tree complete
                        MainActivity.counter++;
                    if (ochar == WorldH.charAt(3)) {
                            MainActivity.counter++;
                        if (wchar == WorldH.charAt(4)) { //--row
                                MainActivity.counter++;
                            }
                        }
                    else if (wchar == WorldH.charAt(4)){ //--r-w
                            MainActivity.counter++;
                        }
                    }
                else if (ochar == WorldH.charAt(3)) { //Tree complete
                    MainActivity.counter++;
                    if (wchar == WorldH.charAt(4)) { //---ow
                        MainActivity.counter++;
                    }
                }
                    else if (wchar == WorldH.charAt(4)) { //Tree complete
                        MainActivity.counter++; //----w

                }
                startActivity(new Intent(question2.this, question3.class));
            }
        });
    }
}
