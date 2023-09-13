package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv1;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.TextView1);
        text = tv1.getText().toString();
        text += "\nInside onCreate() method!";
        tv1.setText(text);




    }
    public void onStart()
    {
        super.onStart();
        text += "\nInside onStart() method!";
        tv1.setText(text);
    }
    public void onRestart()
    {
        super.onRestart();
        text += "\nInside onRestart() method!";
        tv1.setText(text);
    }
    public void onResume()
    {
        super.onResume();
        text += "\nInside onResume() method!";
        tv1.setText(text);
    }
    public void onPause()
    {
        super.onPause();
        text += "\nInside onPause() method!";
        tv1.setText(text);
    }
    public void onStop()
    {
        super.onStop();
        text += "\nInside onStop() method!";
        tv1.setText(text);
    }
    public void onDestroy()
    {
        super.onDestroy();
        text += "\nInside onDestroy() method!";
        tv1.setText(text);
    }

}