package com.myorg.game_bj.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {
    private String username;
    private Long coins;
    private BetBox betBox;
    private String rol;
}
