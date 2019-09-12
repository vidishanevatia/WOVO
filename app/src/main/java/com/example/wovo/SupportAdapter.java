package com.example.wovo;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ReportFragment;

class SupportAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public SupportAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HelpFragment helpFragment = new HelpFragment();
                return helpFragment;
            case 1:
                ReportProblemFragment reportProblemFragment = new ReportProblemFragment();
                return reportProblemFragment;

            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}