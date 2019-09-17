package com.example.student.hph_cau1;

import android.media.Image;

public abstract class Contact {
    private Image img;
    private String name;
    private int birth;
    private Image flagcountry;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public Image getFlagcountry() {
        return flagcountry;
    }

    public void setFlagcountry(Image flagcountry) {
        this.flagcountry = flagcountry;
    }
}
