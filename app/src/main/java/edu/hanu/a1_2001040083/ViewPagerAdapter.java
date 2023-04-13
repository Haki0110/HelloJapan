package edu.hanu.a1_2001040083;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int navigate) {
        switch (navigate) {
            default:
                return new HiraganaFragment();
            case 1:
                return new KatakanaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
