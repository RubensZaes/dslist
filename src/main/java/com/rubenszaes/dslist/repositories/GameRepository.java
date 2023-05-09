package com.rubenszaes.dslist.repositories;

import com.rubenszaes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
