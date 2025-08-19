package com.Lucas_Br4ga.gameList.repositories;

import com.Lucas_Br4ga.gameList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

