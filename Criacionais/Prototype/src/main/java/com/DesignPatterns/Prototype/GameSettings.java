package com.DesignPatterns.Prototype;

public class GameSettings implements Cloneable{

    private int brightness;
    private int volume;
    private String difficulty;

    public GameSettings(int brightness, int volume, String difficulty) {
        this.brightness = brightness;
        this.volume = volume;
        this.difficulty = difficulty;
    }

    @Override
    protected GameSettings clone()  {
        try{
            return (GameSettings) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "brightness=" + brightness +
                ", volume=" + volume +
                ", difficulty='" + difficulty + '\'' +
                ", Hash: "+this.hashCode() +
                '}';
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
