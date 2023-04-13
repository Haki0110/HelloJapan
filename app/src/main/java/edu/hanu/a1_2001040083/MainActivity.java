package edu.hanu.a1_2001040083;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<Integer, Integer> hearingDatabase;
    ViewPager2 lookablePages;
    RadioButton bnrHiras, bnrKatas;
    ViewPagerAdapter lookageAdatp;
    LocalBroadcastManager broascastManager;
    BroadcastReceiver init;
    MediaPlayer toolMediaRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lookon();
        soundOn();
        assumerClicker();
    }

    @Override
    protected void onResume() {
        super.onResume();
        init = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                int soundSource = intent.getIntExtra("soundSource", -1);
                if (soundSource != -1 && hearingDatabase.get(soundSource) != -1) {
                    toolMediaRunning = MediaPlayer.create(getApplicationContext(), hearingDatabase.get(soundSource));
                    toolMediaRunning.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            mediaPlayer.start();
                        }
                    });
                }
            }
        };
        broascastManager.registerReceiver(init,new IntentFilter("soundCallback"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        broascastManager.unregisterReceiver(init);
    }

    protected void assumerClicker() {
        bnrHiras.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lookablePages.setCurrentItem(0);
                }
            }
        });
        bnrKatas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lookablePages.setCurrentItem(1);
                }
            }
        });
    }
    protected void lookon() {
        lookablePages = findViewById(R.id.alphabetPager);
        bnrHiras = findViewById(R.id.btnHiragana);
        bnrKatas = findViewById(R.id.btnKatakana);
        lookageAdatp = new ViewPagerAdapter(this);

        lookablePages.setAdapter(lookageAdatp);
        lookablePages.setOffscreenPageLimit(2);
        lookablePages.setUserInputEnabled(false);

        broascastManager = LocalBroadcastManager.getInstance(this);
    }
    protected void soundOn() {
        hearingDatabase = new HashMap<>();
        hearingDatabase.put(0,R.raw.a);
        hearingDatabase.put(1,R.raw.i);
        hearingDatabase.put(2,R.raw.u);
        hearingDatabase.put(3,R.raw.e);
        hearingDatabase.put(4,R.raw.o);
        hearingDatabase.put(5,R.raw.ka);
        hearingDatabase.put(6,R.raw.ki);
        hearingDatabase.put(7,R.raw.ku);
        hearingDatabase.put(8,R.raw.ke);
        hearingDatabase.put(9,R.raw.ko);
        hearingDatabase.put(10,R.raw.sa);
        hearingDatabase.put(11,R.raw.shi);
        hearingDatabase.put(12,R.raw.su);
        hearingDatabase.put(13,R.raw.se);
        hearingDatabase.put(14,R.raw.so);
        hearingDatabase.put(15,R.raw.ta);
        hearingDatabase.put(16,R.raw.chi);
        hearingDatabase.put(17,R.raw.tsu);
        hearingDatabase.put(18,R.raw.te);
        hearingDatabase.put(19,R.raw.to);
        hearingDatabase.put(20,R.raw.na);
        hearingDatabase.put(21,R.raw.ni);
        hearingDatabase.put(22,R.raw.nu);
        hearingDatabase.put(23,R.raw.ne);
        hearingDatabase.put(24,R.raw.no);
        hearingDatabase.put(25,R.raw.ha);
        hearingDatabase.put(26,R.raw.hi);
        hearingDatabase.put(27,R.raw.fu);
        hearingDatabase.put(28,R.raw.he);
        hearingDatabase.put(29,R.raw.ho);
        hearingDatabase.put(30,R.raw.ma);
        hearingDatabase.put(31,R.raw.mi);
        hearingDatabase.put(32,R.raw.mu);
        hearingDatabase.put(33,R.raw.me);
        hearingDatabase.put(34,R.raw.mo);
        hearingDatabase.put(35,R.raw.ya);
        hearingDatabase.put(36,-1);
        hearingDatabase.put(37,R.raw.yu);
        hearingDatabase.put(38,-1);
        hearingDatabase.put(39,R.raw.yo);
        hearingDatabase.put(40,R.raw.ra);
        hearingDatabase.put(41,R.raw.ri);
        hearingDatabase.put(42,R.raw.ru);
        hearingDatabase.put(43,R.raw.re);
        hearingDatabase.put(44, R.raw.ro);
        hearingDatabase.put(45, R.raw.wa);
        hearingDatabase.put(46, -1);
        hearingDatabase.put(47, -1);
        hearingDatabase.put(48, -1);
        hearingDatabase.put(49, R.raw.wo);
        hearingDatabase.put(50, R.raw.n);
    }
}