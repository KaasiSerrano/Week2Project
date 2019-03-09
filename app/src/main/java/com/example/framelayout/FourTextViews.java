package com.example.framelayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

public class FourTextViews extends Fragment {


/*

        OnItemClickListener listener;

        public interface OnItemClickListener
        {
            void onItemClick(int position);
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            try{
                listener=(OnItemClickListener)getActivity();
            }catch (ClassCastException ex)
            {
                throw new ClassCastException(getContext().toString()+" Should be an instance of OnClickListener");
            }
        }
*/


        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView= inflater.inflate(R.layout.fourtextviews,container,false);


            return rootView;
        }


    }
