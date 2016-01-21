package com.example.at1006749.medapp10;

import android.content.Context;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by 1006749 on 1/21/2016.
 */
public abstract class JSONstorer {
    protected Context mContext;
    protected String mFilename;
    private static final int MainActivity = 0;

    public JSONstorer() {}

    public JSONstorer(Context c, String f) {
        mContext = c;
        mFilename = f;
    }

    public abstract MainActivity load() throws IOException, JSONException;
    public abstract void save(MainActivity mainactivity) throws JSONException, IOException;
}
