package ru.dvfu.mrcpk.restapi.model;

import java.io.Serializable;

public class Option implements Serializable {

    private long id;

    private String text;

    private boolean correct;

    private boolean userAnswer;

    public Option(){}

    public Option(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public Option(long id, String text, boolean correct) {
        this(text,correct);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean isUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }
}
