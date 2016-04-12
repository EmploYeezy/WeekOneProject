package com.example.employeezy.homeworkgrader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //captures int from sendGrade button, makes useful int.
    public void sendGrade(View view) {
        EditText numGrad = (EditText) findViewById(R.id.numGrad);
        String iGrad = numGrad.getText().toString();
        int myInt = Integer.parseInt(iGrad);
        if(myInt >= 60);
        //Print PASS!!
        else (myInt <= 60);
        //Print you are Failure
    }

    //captures int from sendPassFail, makes useful int.
    public void sendPassFail(View view) {
        EditText numGrad = (EditText) findViewById(R.id.numGrad);
        String iGrad = numGrad.getText().toString();
        int myInt = Integer.parseInt(iGrad);
        //System.out.println(myInt);
    }
    //captures int from print5X, makes useful int.
    public void sendFiveX(View view) {
        EditText numGrad = (EditText) findViewById(R.id.numGrad);
        String iGrad = numGrad.getText().toString();
        int myInt = Integer.parseInt(iGrad);
        //System.out.println(myInt);
    }
}
