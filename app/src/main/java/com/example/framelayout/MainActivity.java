package com.example.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1, t2, t3, t4;
    LinearLayout layout;
ImageView profilePic;
    FavesFragmentBrain favesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favesFragment = (FavesFragmentBrain) getSupportFragmentManager().findFragmentById(R.id.fragment);
        layout = findViewById(R.id.linearLayoutAncho);



        t1 = findViewById(R.id.textNum1);
        t1.setOnClickListener(this);
        t2 = findViewById(R.id.textNum2);
        t2.setOnClickListener(this);
        t3 = findViewById(R.id.textNum3);
        t3.setOnClickListener(this);
        t4 = findViewById(R.id.textNum4);
        t4.setOnClickListener(this);
        profilePic = findViewById(R.id.profilePic);


    }

    @Override
    public void onBackPressed() {

        if (favesFragment.findOutIfVisible()==true)
        {
            favesFragment.changeFocus1();
        }
        else {
            finish();
        }

    }
    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.textNum1: {
                favesFragment.setTitle(v.getResources().getString(R.string.sample_text_1));
                favesFragment.setBody(v.getResources().getString(R.string.jessicarabbit));

                if (favesFragment.isorientationLandscape() == true) {
                    favesFragment.makeVisiable();
                }else {
                    favesFragment.changeFocus1();
                }
                profilePic.setBackgroundResource(R.drawable.jessicarabbit);

            }break;

            case R.id.textNum2: {
                favesFragment.setTitle(v.getResources().getString(R.string.sample_text_2));
                favesFragment.setBody(v.getResources().getString(R.string.ladygaga));
                if (favesFragment.isorientationLandscape() == true) {
                    favesFragment.makeVisiable();
                }else {
                    favesFragment.changeFocus1();
                }
                profilePic.setBackgroundResource(R.drawable.ladygaga);

                break;
            }
            case R.id.textNum3: {
                favesFragment.setTitle(v.getResources().getString(R.string.sample_text_3));
                favesFragment.setBody(v.getResources().getString(R.string.dialupa));
                if(favesFragment.isorientationLandscape()==true) {
                    favesFragment.makeVisiable();
                }else {
                    favesFragment.changeFocus1();
                }
                profilePic.setBackgroundResource(R.drawable.dialupa);

            }
            break;

            case R.id.textNum4: {
                favesFragment.setTitle(v.getResources().getString(R.string.sample_text_4));
                favesFragment.setBody(v.getResources().getString(R.string.rileyreid));
                if(favesFragment.isorientationLandscape()==true) {
                    favesFragment.makeVisiable();
                }else {
                    favesFragment.changeFocus1();
                }
                profilePic.setBackgroundResource(R.drawable.reilyreid);

            }break;

        }

    }
}






