package ru.studiotg.minesweeper.mapper;


import org.mapstruct.Mapper;

import ru.studiotg.minesweeper.dto.GameInfoResponseDTO;
import ru.studiotg.minesweeper.model.Game;


@Mapper(componentModel = "spring")
public interface GameMapper
{
    GameInfoResponseDTO fromGame(Game game);
}