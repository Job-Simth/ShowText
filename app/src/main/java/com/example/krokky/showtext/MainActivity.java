package com.example.krokky.showtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
    }
    public void onClick(View v) {
        edt = findViewById(R.id.editText);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("sendMes", edt.getText().toString());
        startActivity(intent);
    }
}
