package ru.javarush.catJava.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Answer {

    @JsonProperty("answer")
    private final String answer;
    @JsonProperty("trueAnswer")
    private final Boolean trueAnswer;

    public Answer(@JsonProperty(value = "answer") String answer,
                  @JsonProperty(value = "trueAnswer") Boolean trueAnswer) {
        this.answer = answer;
        this.trueAnswer = trueAnswer;
    }
}
