package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private String playerName;
    private String rolePlayer;
    private int mmr;
}
