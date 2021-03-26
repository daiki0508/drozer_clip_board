package com.example.drozer_clip_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void execute_button(View view){
        EditText editText = findViewById(R.id.input_password);
        String input = editText.getText().toString();
        if (input.equals(getString(R.string.password))){
            Intent intent = new Intent(MainActivity.this,ConfirmActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this,"Wrong…",Toast.LENGTH_SHORT).show();
        }
    }
}