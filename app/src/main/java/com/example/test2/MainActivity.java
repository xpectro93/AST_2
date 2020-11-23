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

//        TextView txtHello = findViewById(R.id.txtMessage);

        //If you want o hard code text use double quotations
//        txtHello.setText("Yo");



    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);



        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);

        //convert to string then set to variable then set variable to b new text value
        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();


        //concat two strings
        txtFirstName.setText(firstName);
        txtLastName.setText(lastName);
        txtEmail.setText(email);


    }

}