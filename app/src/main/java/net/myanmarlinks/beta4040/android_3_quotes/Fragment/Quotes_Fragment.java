package net.myanmarlinks.beta4040.android_3_quotes.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.myanmarlinks.beta4040.android_3_quotes.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Quotes_Fragment extends Fragment {


    public Quotes_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quotes_, container, false);
    }

}
