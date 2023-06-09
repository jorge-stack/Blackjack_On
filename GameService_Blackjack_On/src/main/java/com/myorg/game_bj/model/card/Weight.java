package com.myorg.game_bj.model.card;

import lombok.Getter;

@Getter
public enum Weight {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String value;

    private Weight (String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}

