package com.example.recyclerview;

public class Country {
    int photo;
    String title;
    String code;
    String capital;
    String president;

    public Country(int photo, String title, String code, String capital, String president){
        this.photo = photo;
        this.title = title;
        this.code = code;
        this.capital = capital;
        this.president = president;

    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getCapital() { return capital; }

    public String getPresident() { return  president; }
}
