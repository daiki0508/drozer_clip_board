package com.example.drozer_clip_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void execute_button(View view){
        EditText editText = findViewById(R.id.input_password);
        String input = editText.getText().toString();
        if (input.equals(getString(R.string.password))){
            Toast.makeText(this,"Success!!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Wrong…",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ConfirmActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}