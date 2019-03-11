package com.example.framelayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.button_login)
    Button btnLogin;
    Credentials user1;
    private static String CREDENTIALS = "Credentials";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        user1 = new Credentials();
        getData();

    }

    @OnClick(R.id.button_login)
    public void onViewClicked() {
        Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
        user1.setEmail(etEmail.getText().toString());
        user1.setPassword(etPassword.getText().toString());
        saveData();
        if (!etEmail.getText().toString().isEmpty() && !etPassword.getText().toString().isEmpty()) {
            goToEditActivity();
        }
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(CREDENTIALS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("EMAIL", etEmail.getText().toString());
        editor.putString("PASSWORD", etPassword.getText().toString());
        editor.apply();
        Log.d("Main Activity 2", "Info Saved");
    }

    private void getData() {
        SharedPreferences sharedPreferences = getSharedPreferences(CREDENTIALS, Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("EMAIL", "");
        String password = sharedPreferences.getString("PASSWORD", "");
        etEmail.setText(email);
        //if email and password are not empty
        if (!email.isEmpty() && !password.isEmpty()) {
            goToEditActivity();
        }
    }

    private void goToEditActivity() {
        Intent intent = new Intent(this, EditActivity.class);
        intent.setAction("SETUP");
        startActivity(intent);
        finish();
    }
}
