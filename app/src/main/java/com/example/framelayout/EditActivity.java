package com.example.framelayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditActivity extends AppCompatActivity {

    @BindView(R.id.tv_name_field)
    EditText etNameField;
    @BindView(R.id.tv_age)
    EditText etAge;
    @BindView(R.id.tv_gender)
    EditText etGender;
    @BindView(R.id.tv_occupation)
    EditText etOccupation;
    @BindView(R.id.tv_location)
    EditText etLocation;
    @BindView(R.id.tv_bio_field)
    EditText etBioField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ButterKnife.bind(this);
        getData();
    }

    @OnClick(R.id.button_save)
    public void onViewClicked() {
        //Save data to Shared Preferences
        saveData();
        returnToProfile();
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("PROFILE", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", etNameField.getText().toString());
        editor.putString("AGE", etAge.getText().toString());
        editor.putString("GENDER", etGender.getText().toString());
        editor.putString("OCCUPATION", etOccupation.getText().toString());
        editor.putString("LOCATION", etLocation.getText().toString());
        editor.putString("BIO", etBioField.getText().toString());
        editor.apply();
        Log.d("Main Activity 2", "Info Saved");
    }
    private void getData() {
        SharedPreferences sharedPreferences = getSharedPreferences("PROFILE", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");
        String age = sharedPreferences.getString("AGE", "");
        String gender = sharedPreferences.getString("GENDER", "");
        String occupation = sharedPreferences.getString("OCCUPATION", "");
        String location = sharedPreferences.getString("LOCATION", "");
        String bio = sharedPreferences.getString("BIO", "");

        etNameField.setText(name);
        etAge.setText(age);
        etGender.setText(gender);
        etOccupation.setText(occupation);
        etLocation.setText(location);
        etBioField.setText(bio);
    }
    private void returnToProfile(){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}
