package edu.hanu.a1_2001040083;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KatakanaFragment extends Fragment {
    RecyclerView katakaBin;
    RecyclerAdapter adaptObjects;
    ArrayList<Alphabet> ktakanaImges;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater flatinter, @Nullable ViewGroup storageslibs, @Nullable Bundle savedInstanceState) {
        databasesInIts();
        View view = flatinter.inflate(R.layout.fragment_katakana, storageslibs, false);
        mapping(view);
        return view;
    }

    protected void mapping(View view) {
        katakaBin = view.findViewById(R.id.KatakanaRecyclerView);
        adaptObjects = new RecyclerAdapter(getContext(), R.layout.row_alphabet, ktakanaImges);
        katakaBin.setAdapter(adaptObjects);
    }

    protected void databasesInIts() {
        ktakanaImges = new ArrayList<>();
        ktakanaImges.add(new Alphabet(R.drawable.a1));
        ktakanaImges.add(new Alphabet(R.drawable.i1));
        ktakanaImges.add(new Alphabet(R.drawable.u1));
        ktakanaImges.add(new Alphabet(R.drawable.e1));
        ktakanaImges.add(new Alphabet(R.drawable.o1));
        ktakanaImges.add(new Alphabet(R.drawable.ka1));
        ktakanaImges.add(new Alphabet(R.drawable.ki1));
        ktakanaImges.add(new Alphabet(R.drawable.ku1));
        ktakanaImges.add(new Alphabet(R.drawable.ke1));
        ktakanaImges.add(new Alphabet(R.drawable.ko1));
        ktakanaImges.add(new Alphabet(R.drawable.sa1));
        ktakanaImges.add(new Alphabet(R.drawable.shi1));
        ktakanaImges.add(new Alphabet(R.drawable.su1));
        ktakanaImges.add(new Alphabet(R.drawable.se1));
        ktakanaImges.add(new Alphabet(R.drawable.so1));
        ktakanaImges.add(new Alphabet(R.drawable.ta1));
        ktakanaImges.add(new Alphabet(R.drawable.chi1));
        ktakanaImges.add(new Alphabet(R.drawable.tsu1));
        ktakanaImges.add(new Alphabet(R.drawable.te1));
        ktakanaImges.add(new Alphabet(R.drawable.to1));
        ktakanaImges.add(new Alphabet(R.drawable.na1));
        ktakanaImges.add(new Alphabet(R.drawable.ni1));
        ktakanaImges.add(new Alphabet(R.drawable.nu1));
        ktakanaImges.add(new Alphabet(R.drawable.ne1));
        ktakanaImges.add(new Alphabet(R.drawable.no1));
        ktakanaImges.add(new Alphabet(R.drawable.ha1));
        ktakanaImges.add(new Alphabet(R.drawable.hi1));
        ktakanaImges.add(new Alphabet(R.drawable.fu1));
        ktakanaImges.add(new Alphabet(R.drawable.he1));
        ktakanaImges.add(new Alphabet(R.drawable.ho1));
        ktakanaImges.add(new Alphabet(R.drawable.ma1));
        ktakanaImges.add(new Alphabet(R.drawable.mi1));
        ktakanaImges.add(new Alphabet(R.drawable.mu1));
        ktakanaImges.add(new Alphabet(R.drawable.me1));
        ktakanaImges.add(new Alphabet(R.drawable.mo1));
        ktakanaImges.add(new Alphabet(R.drawable.ya1));
        ktakanaImges.add(new Alphabet(R.drawable.empty));
        ktakanaImges.add(new Alphabet(R.drawable.yu1));
        ktakanaImges.add(new Alphabet(R.drawable.empty));
        ktakanaImges.add(new Alphabet(R.drawable.yo1));
        ktakanaImges.add(new Alphabet(R.drawable.ra1));
        ktakanaImges.add(new Alphabet(R.drawable.ri1));
        ktakanaImges.add(new Alphabet(R.drawable.ru1));
        ktakanaImges.add(new Alphabet(R.drawable.re1));
        ktakanaImges.add(new Alphabet( R.drawable.ro1));
        ktakanaImges.add(new Alphabet( R.drawable.wa1));
        ktakanaImges.add(new Alphabet( R.drawable.empty));
        ktakanaImges.add(new Alphabet( R.drawable.empty));
        ktakanaImges.add(new Alphabet( R.drawable.empty));
        ktakanaImges.add(new Alphabet( R.drawable.wo1));
        ktakanaImges.add(new Alphabet(R.drawable.n1));
    }
}
