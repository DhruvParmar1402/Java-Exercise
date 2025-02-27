package com.example.demo.OnetoMany;


import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
//@Table(name = "Question")
public class QuestionEntityOneToMany {

    @Id
    @Column(name = "QuestionId")
    private int question_id;

    @Column(name = "Question")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AnswerEntityManyToOne> ans;

    public QuestionEntityOneToMany() {
    }

    public QuestionEntityOneToMany(int question_id, String question, List<AnswerEntityManyToOne> ans) {
        this.question_id = question_id;
        this.question = question;
        this.ans = ans;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerEntityManyToOne> getAns() {
        return ans;
    }

    public void setAns(List<AnswerEntityManyToOne> ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "QuestionEntityOneToMany{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", ans=" + ans +
                '}';
    }
}
