package com.example.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1, t2, t3, t4;
    LinearLayout layout;

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

    }

    @Override
    public void onBackPressed() {

        if (favesFragment.findOutIfVisible()==true)
        {
            favesFragment.changeFocus1();
        }
        else {
            moveTaskToBack(true);
        }

    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.textNum1: {
                favesFragment.setTitle("This is Title 1");
                favesFragment.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam tincidunt, tellus sed feugiat tincidunt, justo risus auctor nunc, nec imperdiet tortor sem vitae ante. Aenean vitae tincidunt urna, gravida feugiat nibh. Morbi pretium magna arcu, ut volutpat nulla placerat nec. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam placerat lacus a consectetur lacinia. Aenean tempus, nibh nec commodo mattis, est diam sagittis turpis, ut accumsan urna lacus at urna. Ut pulvinar imperdiet elit a dictum.");
                favesFragment.changeFocus1();

            }
            break;

            case R.id.textNum2: {
                favesFragment.setTitle("This is Title 2");
                favesFragment.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam tincidunt, tellus sed feugiat tincidunt, justo risus auctor nunc, nec imperdiet tortor sem vitae ante. Aenean vitae tincidunt urna, gravida feugiat nibh. Morbi pretium magna arcu, ut volutpat nulla placerat nec. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam placerat lacus a consectetur lacinia. Aenean tempus, nibh nec commodo mattis, est diam sagittis turpis, ut accumsan urna lacus at urna. Ut pulvinar imperdiet elit a dictum.");
                favesFragment.changeFocus1();


            }
            break;

            case R.id.textNum3: {
                favesFragment.setTitle("This is Title 3");
                favesFragment.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam tincidunt, tellus sed feugiat tincidunt, justo risus auctor nunc, nec imperdiet tortor sem vitae ante. Aenean vitae tincidunt urna, gravida feugiat nibh. Morbi pretium magna arcu, ut volutpat nulla placerat nec. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam placerat lacus a consectetur lacinia. Aenean tempus, nibh nec commodo mattis, est diam sagittis turpis, ut accumsan urna lacus at urna. Ut pulvinar imperdiet elit a dictum.");
                favesFragment.changeFocus1();


            }
            break;

            case R.id.textNum4: {
                favesFragment.setTitle("This is Title 4");
                favesFragment.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam tincidunt, tellus sed feugiat tincidunt, justo risus auctor nunc, nec imperdiet tortor sem vitae ante. Aenean vitae tincidunt urna, gravida feugiat nibh. Morbi pretium magna arcu, ut volutpat nulla placerat nec. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam placerat lacus a consectetur lacinia. Aenean tempus, nibh nec commodo mattis, est diam sagittis turpis, ut accumsan urna lacus at urna. Ut pulvinar imperdiet elit a dictum.");
                favesFragment.changeFocus1();

            }
            break;

        }

    }
}






