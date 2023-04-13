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

public class HiraganaFragment extends Fragment {
    ArrayList<Alphabet> hiraImagees;
    RecyclerView hirabinRecycles;
    RecyclerAdapter adapttools;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater faterin, @Nullable ViewGroup storages, @Nullable Bundle savedInstanceState) {
        initDatabases();
        View view = faterin.inflate(R.layout.fragment_hiragana, storages, false);
        mapping(view);
        return view;
    }

    protected void mapping(View view) {
        hirabinRecycles = view.findViewById(R.id.HiraganaRecyclerView);
        adapttools = new RecyclerAdapter(requireContext(), R.layout.row_alphabet, hiraImagees);
        hirabinRecycles.setAdapter(adapttools);
    }


    protected void initDatabases() {
        hiraImagees = new ArrayList<>();
        hiraImagees.add(new Alphabet(R.drawable.a));
        hiraImagees.add(new Alphabet(R.drawable.i));
        hiraImagees.add(new Alphabet(R.drawable.u));
        hiraImagees.add(new Alphabet(R.drawable.e));
        hiraImagees.add(new Alphabet(R.drawable.o));
        hiraImagees.add(new Alphabet(R.drawable.ka));
        hiraImagees.add(new Alphabet(R.drawable.ki));
        hiraImagees.add(new Alphabet(R.drawable.ku));
        hiraImagees.add(new Alphabet(R.drawable.ke));
        hiraImagees.add(new Alphabet(R.drawable.ko));
        hiraImagees.add(new Alphabet(R.drawable.sa));
        hiraImagees.add(new Alphabet(R.drawable.shi));
        hiraImagees.add(new Alphabet(R.drawable.su));
        hiraImagees.add(new Alphabet(R.drawable.se));
        hiraImagees.add(new Alphabet(R.drawable.so));
        hiraImagees.add(new Alphabet(R.drawable.ta));
        hiraImagees.add(new Alphabet(R.drawable.chi));
        hiraImagees.add(new Alphabet(R.drawable.tsu));
        hiraImagees.add(new Alphabet(R.drawable.te));
        hiraImagees.add(new Alphabet(R.drawable.to));
        hiraImagees.add(new Alphabet(R.drawable.na));
        hiraImagees.add(new Alphabet(R.drawable.ni));
        hiraImagees.add(new Alphabet(R.drawable.nu));
        hiraImagees.add(new Alphabet(R.drawable.ne));
        hiraImagees.add(new Alphabet(R.drawable.no));
        hiraImagees.add(new Alphabet(R.drawable.ha));
        hiraImagees.add(new Alphabet(R.drawable.hi));
        hiraImagees.add(new Alphabet(R.drawable.fu));
        hiraImagees.add(new Alphabet(R.drawable.he));
        hiraImagees.add(new Alphabet(R.drawable.ho));
        hiraImagees.add(new Alphabet(R.drawable.ma));
        hiraImagees.add(new Alphabet(R.drawable.mi));
        hiraImagees.add(new Alphabet(R.drawable.mu));
        hiraImagees.add(new Alphabet(R.drawable.me));
        hiraImagees.add(new Alphabet(R.drawable.mo));
        hiraImagees.add(new Alphabet(R.drawable.ya));
        hiraImagees.add(new Alphabet(R.drawable.empty));
        hiraImagees.add(new Alphabet(R.drawable.yu));
        hiraImagees.add(new Alphabet(R.drawable.empty));
        hiraImagees.add(new Alphabet(R.drawable.yo));
        hiraImagees.add(new Alphabet(R.drawable.ra));
        hiraImagees.add(new Alphabet(R.drawable.ri));
        hiraImagees.add(new Alphabet(R.drawable.ru));
        hiraImagees.add(new Alphabet(R.drawable.re));
        hiraImagees.add(new Alphabet(R.drawable.ro));
        hiraImagees.add(new Alphabet(R.drawable.wa));
        hiraImagees.add(new Alphabet(R.drawable.empty));
        hiraImagees.add(new Alphabet(R.drawable.empty));
        hiraImagees.add(new Alphabet(R.drawable.empty));
        hiraImagees.add(new Alphabet(R.drawable.wo));
        hiraImagees.add(new Alphabet(R.drawable.n));
    }
}
