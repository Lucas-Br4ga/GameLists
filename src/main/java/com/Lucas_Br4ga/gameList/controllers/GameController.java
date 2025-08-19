package com.Lucas_Br4ga.gameList.controllers;

import com.Lucas_Br4ga.gameList.dto.GameMinDTO;
import com.Lucas_Br4ga.gameList.entities.Game;
import com.Lucas_Br4ga.gameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
