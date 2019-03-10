package com.example.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1, t2, t3, t4;

    FavesFragmentBrain favesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favesFragment = (FavesFragmentBrain) getSupportFragmentManager().findFragmentById(R.id.fragment);

        t1 = findViewById(R.id.textNum1);
        t1.setOnClickListener(this);
        t2 = findViewById(R.id.textNum2);
        t2.setOnClickListener(this);
        t3 = findViewById(R.id.textNum3);
        t3.setOnClickListener(this);
        t4 = findViewById(R.id.textNum4);
        t4.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        favesFragment.changeFocus1();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textNum1: {
                favesFragment.setTitle("This is Title 1");
                favesFragment.setBody("THIS IS BODY 1");
                favesFragment.changeFocus1();
            }
            break;

            case R.id.textNum2: {
                favesFragment.setTitle("This is Title 2");
                favesFragment.setBody("THIS IS BODY 2");
                favesFragment.changeFocus1();


            }
            break;

            case R.id.textNum3: {
                favesFragment.setTitle("This is Title 3");
                favesFragment.setBody("THIS IS BODY 3");
                favesFragment.changeFocus1();


            }
            break;

            case R.id.textNum4: {
                favesFragment.setTitle("This is Title 4");
                favesFragment.setBody("THIS IS BODY 4");
                favesFragment.changeFocus1();


            }
            break;

        }

    }
}






