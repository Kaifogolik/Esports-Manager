package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Team {
    private String team;
    private String[] players;
    private int mmrAll;
}
