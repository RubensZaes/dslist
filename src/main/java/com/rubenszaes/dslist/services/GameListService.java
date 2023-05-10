package com.rubenszaes.dslist.services;

import com.rubenszaes.dslist.dto.GameDTO;
import com.rubenszaes.dslist.dto.GameListDTO;
import com.rubenszaes.dslist.dto.GameMinDTO;
import com.rubenszaes.dslist.entities.Game;
import com.rubenszaes.dslist.entities.GameList;
import com.rubenszaes.dslist.repositories.GameListRepository;
import com.rubenszaes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepositoryRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepositoryRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
