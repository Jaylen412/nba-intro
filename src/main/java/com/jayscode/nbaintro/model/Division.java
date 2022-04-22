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
public class Division {
    private UUID divisionId;
    private String DivisionName;
    private Conference conference;
}
