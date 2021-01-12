package com.example.myhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     Button btnSing;
    EditText password,sing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     private void Init(){
        sing = findViewById(R.id.login);
        password = findViewById(R.id.password);

        findViewById(R.id.btnSing).setOnClickListener(v -> {
            if (sing.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this,"Введите логин или пароль" , Toast.LENGTH_SHORT).show();
            } else if (password.length() > 6)
                Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
            else {
                Toast.makeText(MainActivity.this, "Пароль должен содержать более 6 символов", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
