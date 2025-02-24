package ru.studiotg.minesweeper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameInfoResponseDTO
{
    @JsonProperty("game_id")
    private String gameId;

    @JsonProperty("width")
    private int width;

    @JsonProperty("height")
    private int height;

    @JsonProperty("mines_count")
    private int minesCount;

    @JsonProperty("completed")
    private boolean completed;

    @JsonProperty("field")
    private String[][] field;
}
