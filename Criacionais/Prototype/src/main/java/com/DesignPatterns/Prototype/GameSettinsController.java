package com.DesignPatterns.Prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gameSettings")
public class GameSettinsController {

    @Autowired
    private GameSettingsService gameSettingsService;

    @GetMapping
    public ResponseEntity<Object> createAndCloneGameSettings(){
        GameSettings gameSettings = this.gameSettingsService.createGameSettins();
        GameSettings cloneGameSettings = this.gameSettingsService.cloneGameSettings(gameSettings);

        Object retorno = new Object(){
            String game = gameSettings.toString();
            String clone = cloneGameSettings.toString();

            public List<String> getGameSettings(){
                List<String> retorno = new ArrayList<>();
                retorno.add(game);
                retorno.add(clone);
                return retorno;
            }
        };

        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
