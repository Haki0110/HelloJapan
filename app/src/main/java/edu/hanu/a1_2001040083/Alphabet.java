package edu.hanu.a1_2001040083;

public class Alphabet {
    int image;
    boolean playable;

    public Alphabet(int image) {
        this.image = image;
        if (image == -1) {
            playable = false;
        } else {
            playable = true;
        }
    }

    public int getImage() {
        return image;
    }

    public boolean isPlayable() {
        return playable;
    }
}
