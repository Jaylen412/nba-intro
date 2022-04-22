package com.jayscode.nbaintro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private UUID playerId;
    private String playerName;
    private String position;
    private Team team;

}
