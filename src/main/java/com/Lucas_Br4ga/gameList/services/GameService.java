package com.Lucas_Br4ga.gameList.services;

import com.Lucas_Br4ga.gameList.dto.GameDTO;
import com.Lucas_Br4ga.gameList.dto.GameMinDTO;
import com.Lucas_Br4ga.gameList.entities.Game;
import com.Lucas_Br4ga.gameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
   public List<GameMinDTO> findAll(){
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
    return dto;
   }

   @Transactional(readOnly = true)
   public GameDTO findById(Long id){
       Game result = gameRepository.findById(id).get();
       return new GameDTO(result);
   }
}

