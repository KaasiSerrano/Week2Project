package com.example.framelayout;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FavesFragmentBrain extends Fragment {

    TextView textTitle, textBody;
    LinearLayout layout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.favesfragment, container, false);

        layout = rootView.findViewById(R.id.linearLayoutAncho);

        textTitle = rootView.findViewById(R.id.favesTitle);
        textBody = rootView.findViewById(R.id.favesInformation);


        return rootView;

    }

    public void setTitle(String title) {
        textTitle.setText(title);

    }

    public void setBody(String title) {
        textBody.setText(title);

    }

    public boolean findOutIfVisible() {
        if (layout.getVisibility() == View.VISIBLE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isorientationLandscape() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            return true;
        } else {

            return false;
        }
    }


    public void changeFocus1() {

        if (layout.getVisibility() == View.VISIBLE) {
            layout.setVisibility(View.INVISIBLE);
        } else {
            layout.setVisibility(View.VISIBLE);

        }
    }

    public void makeVisiable() {
        layout.setVisibility(View.VISIBLE);

    }
}


