package ru.javarush.catJava.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@JsonTypeName
public class Question {

    @JsonProperty("question")
    private String textQuestion;
    @JsonProperty("answers")
    private ArrayList<Answer> answers;
    @JsonProperty("fail")
    private String fail;
    @JsonProperty("pathToImage")
    private String pathToImage;

}
