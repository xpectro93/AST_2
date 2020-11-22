package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//TODO: Learn Java
public class MainActivity extends AppCompatActivity {
    //Anything onCreate method executes as soon as app opens.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R is a special class that gives u access to all resources
        //txtMessage is the same id given to the id on the xml file text
        TextView txtHello = findViewById(R.id.txtMessage);

        //If you want o hard code text use double quotations
        txtHello.setText("Yo");



    }

    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.txtMessage);

        EditText editTxtName = findViewById(R.id.addFirstName);
        //convert to string then set to variable then set variable to b new text value
        String username = editTxtName.getText().toString();

        //concat two strings
        txtHello.setText("Hello " + username);

    }

}