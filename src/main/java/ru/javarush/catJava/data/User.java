package ru.javarush.catJava.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    @JsonProperty("countOfGamesPlayed")
    private int countOfGamesPlayed;

    public User(@JsonProperty(value = "countOfGamesPlayed") int countOfGamesPlayed) {
        this.countOfGamesPlayed = countOfGamesPlayed;
    }
}
