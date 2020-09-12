package com.longnight.visible7.logins;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.longnight.visible7.R;

public class School extends AppCompatActivity {

    private EditText editUsername, editPassword;
    private Button buttonSend;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        editUsername = (EditText)findViewById(R.id.editUsername);
        editPassword = (EditText)findViewById(R.id.editPassword);
        buttonSend = (Button)findViewById(R.id.buttonSend);

    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent();
            startActivity(intent);
        } else {
            counter--;

            if (counter == 0) {
                buttonSend.setEnabled(false);
            }
        }
    }
}
