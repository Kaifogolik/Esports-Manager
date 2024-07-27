package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
public class TeamRepositoryImpl implements TeamRepository {

@Getter
    Team[] team;

    @Override
    public Team teamSearch(String name) {
        for (Team team1 : team) {
            String name1 = team1.getTeam();
            if (name.equals(name1)) {
                return team1;
            }
        }
        System.out.println("Ничего не найдено.");
        return null;
    }
    @Override
    public Team GamerSearch(String player) {
        for (Player player : players) {
            String[] player1 = player.getPlayer();
            if (player.equals(player1)) {
                return player;
            }
        }
        return null;
    }


}

