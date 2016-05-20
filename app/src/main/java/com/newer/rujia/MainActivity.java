package com.newer.rujia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
            Reader reader = new InputStreamReader(getResources().openRawResource(R.raw.data));

        try {
            char[] ch = new char[200];
            int len;
            while((len =reader.read(ch))!=-1){
                String str =new String();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
