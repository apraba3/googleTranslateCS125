package com.example.googletranslatecs125;

public class Translations {
    private String english;
    private String translation;
    private int imageId;

    public Translations(String english, String translation) {
        this.english = english;
        this.translation = translation;
    }

    public Translations(String english, String translation, int imageId) {
        this.english = english;
        this.translation = translation;
        this.imageId = imageId;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
/*
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int image) {
        imageId = image;
    }

 */
}
