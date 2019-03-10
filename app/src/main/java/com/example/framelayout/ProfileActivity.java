package com.example.framelayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button_logout, R.id.button_edit, R.id.button_faves})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_logout:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                SharedPreferences sharedPreferences = getSharedPreferences("CREDENTIALS", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("PASSWORD", "");
                editor.apply();
                finish();
                break;
            case R.id.button_edit:
                break;
            case R.id.button_faves:
                Intent intentFaves = new Intent(this, MainActivity.class);
                startActivity(intentFaves);
                break;
        }
    }
}
