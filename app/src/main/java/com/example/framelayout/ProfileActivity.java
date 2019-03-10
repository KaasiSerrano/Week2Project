package com.example.framelayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.tv_name_field)
    TextView tvNameField;
    @BindView(R.id.tv_bio_field)
    TextView tvBioField;
    @BindView(R.id.tv_age)
    TextView tvAge;
    @BindView(R.id.tv_gender)
    TextView tvGender;
    @BindView(R.id.tv_occupation)
    TextView tvOccupation;
    @BindView(R.id.tv_location)
    TextView tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        getData();
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
                Intent intentEdit = new Intent(this, EditActivity.class);
                startActivity(intentEdit);
                break;
            case R.id.button_faves:
                Intent intentFaves = new Intent(this, MainActivity.class);
                startActivity(intentFaves);
                break;
        }
    }

    private void getData() {
        SharedPreferences sharedPreferences = getSharedPreferences("PROFILE", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");
        String age = sharedPreferences.getString("AGE", "");
        String gender = sharedPreferences.getString("GENDER", "");
        String occupation = sharedPreferences.getString("OCCUPATION", "");
        String location = sharedPreferences.getString("LOCATION", "");
        String bio = sharedPreferences.getString("BIO", "");

        name = "Hello " + name;
        bio = "BIO: " + bio;
        tvNameField.setText(name);
        tvAge.setText(age);
        tvGender.setText(gender);
        tvOccupation.setText(occupation);
        tvLocation.setText(location);
        tvBioField.setText(bio);
    }
}
