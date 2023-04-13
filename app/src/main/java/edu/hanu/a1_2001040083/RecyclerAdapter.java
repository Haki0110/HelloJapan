package edu.hanu.a1_2001040083;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int borderss;
    ArrayList<Alphabet> arrayys;
    Context contextSigns;
    int imagesHigh;

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView lookableImges;
        LocalBroadcastManager brCastingM;
        public ViewHolder(@NonNull View lookableImgs) {
            super(lookableImgs);
            lookableImges = lookableImgs.findViewById(R.id.imgAlphabet);
            lookableImgs.setOnClickListener(view -> {
                brCastingM = LocalBroadcastManager.getInstance(lookableImgs.getContext());
                Intent intent = new Intent("soundCallback");
                intent.putExtra("soundSource", getLayoutPosition());
                brCastingM.sendBroadcast(intent);

                Animation ani = AnimationUtils.loadAnimation(lookableImgs.getContext(), R.anim.selected_item_anim);
                lookableImgs.startAnimation(ani);
            });
        }
    }

    public RecyclerAdapter(Context signatureSign, int borderss, ArrayList<Alphabet> arrayys) {
        this.borderss = borderss;
        this.arrayys = arrayys;
        this.contextSigns = signatureSign;
        imagesHigh = signatureSign.getResources().getDisplayMetrics().widthPixels / 5;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup cousin, int lookable) {
        return new ViewHolder(LayoutInflater.from(contextSigns).inflate(borderss,cousin,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder initut, int navi) {
        Bitmap bitmap = BitmapFactory.decodeResource(contextSigns.getResources(), arrayys.get(navi).getImage());
        ((ViewHolder) initut).lookableImges.getLayoutParams().height = imagesHigh;
        ((ViewHolder) initut).lookableImges.setImageBitmap(bitmap);
    }

    @Override
    public int getItemCount() {
        return arrayys.size();
    }
}
