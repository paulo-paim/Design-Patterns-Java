package com.DesignPatterns.Prototype;

import org.springframework.stereotype.Service;

@Service
public class GameSettingsService {

    public GameSettings createGameSettins(){
        GameSettings newGameSettings = new GameSettings(70,60, "EASY");
        return newGameSettings;
    }

    public GameSettings cloneGameSettings(GameSettings gameSettings){
        GameSettings cloneGameSettings = gameSettings.clone();
        cloneGameSettings.setBrightness(80);
        cloneGameSettings.setDifficulty("HARD");
        cloneGameSettings.setVolume(50);

        return cloneGameSettings;
    }
}
