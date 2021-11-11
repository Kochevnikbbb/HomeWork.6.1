package com.company;

public class Skeleton extends Boss{
    private int strlely;

    public int getStrlely() {
        return strlely;
    }

    public void setStrlely(int strlely) {
        this.strlely = strlely;
    }
    public String printInfo(){return super.printInfo() + " Количество выстрелов - " +getStrlely();}
}
