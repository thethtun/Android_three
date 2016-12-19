package net.myanmarlinks.beta4040.android_3_quotes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import net.myanmarlinks.beta4040.android_3_quotes.Fragment.Quotes_Fragment;
import net.myanmarlinks.beta4040.android_3_quotes.Fragment.Quotes_Fragment_2;
import net.myanmarlinks.beta4040.android_3_quotes.Fragment.Quotes_Fragment_3;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(new QuoteAdapter(getSupportFragmentManager()));
    }


    public class QuoteAdapter extends FragmentPagerAdapter {

        public QuoteAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                Quotes_Fragment quotes_fragment = new Quotes_Fragment();
                return quotes_fragment;
            } else if (position == 1) {
                Quotes_Fragment_2 quotes_fragment_2 = new Quotes_Fragment_2();
                return quotes_fragment_2;
            }
            Quotes_Fragment_3 quotesFragment3 = new Quotes_Fragment_3();
            return quotesFragment3;

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
