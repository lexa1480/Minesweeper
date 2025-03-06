package ru.studiotg.minesweeper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game
{
    public static final String HIDDEN_CELL =   " ";
    public static final String MINE_EXPLODED = "X";
    public static final String MINE_REVEALED = "M";

    private String gameId;
    private boolean isCompleted;
    private boolean isGameOver;

    private boolean[][] mines;
    private boolean[][] revealed;
    private String[][]  field;

    private int width;
    private int height;
    private int minesCount;
}
