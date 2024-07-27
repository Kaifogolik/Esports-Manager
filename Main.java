package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TeamRepositoryImpl teamRepository;
        teamRepository = new TeamRepositoryImpl(new Team[5]);
        Team[] team = teamRepository.getTeam();
        team[0] = new Team("VP", new String[]{"Kiritych", "Squad1x", "Noticed", "Antares", "fng", "G"} );
        team[1] = new Team("TeamSpirit", new String[]{"Raddan", "Larl", "Collapse", "Mira", "Miposhka"});
        team[2] = new Team("Gladiators", new String[]{"Dyrachyo", "Quinn", "Ace", "Tofu", "Seleri"});
        team[3] = new Team("NAVI", new String[]{"shigetsu", "mellojul", "nefrit", "daze", "Malady"});
        team[4] = new Team("LGD", new String[]{"shiro", "Echo", "niu", "Pyw", "y`"});
        Team vp = teamRepository.teamSearch("cum");
        System.out.println(vp.getTeam());
    }


}